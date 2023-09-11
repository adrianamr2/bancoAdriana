package cuentasbancos.bancogestion.web.controller;

import cuentasbancos.bancogestion.domain.AccountDTO;
import cuentasbancos.bancogestion.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/all")
    public ResponseEntity<List<AccountDTO>> getAll(){

        return new ResponseEntity<>(accountService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/{Id}")
    public ResponseEntity<AccountDTO> getAccountDTO(@PathVariable("Id") int accountId){
        return accountService.getAccountDTO(accountId)
                .map(accountDTO -> new ResponseEntity<>(accountDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<AccountDTO>> getByClient(@PathVariable("clientId") int clientId){
        return accountService.getByClient(clientId)
                .map(accountDTOS -> new ResponseEntity<>(accountDTOS, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<AccountDTO> save(@RequestBody AccountDTO accountDTO){
        return new ResponseEntity<>(accountService.save(accountDTO), HttpStatus.CREATED);
    }
    @PostMapping("/delete/{Id}")
    public ResponseEntity delete(@PathVariable("Id") int accountId){
        if (accountService.delete(accountId)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
