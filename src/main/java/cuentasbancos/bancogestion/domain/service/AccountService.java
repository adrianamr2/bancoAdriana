package cuentasbancos.bancogestion.domain.service;

import cuentasbancos.bancogestion.domain.AccountDTO;
import cuentasbancos.bancogestion.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<AccountDTO> getAll(){
        return accountRepository.getAll();
    }

    public Optional<AccountDTO> getAccountDTO(int accountId) {
        return accountRepository.getAccountDTO(accountId);
    }

    public Optional<List<AccountDTO>> getByClient(int clientId) {
        return accountRepository.getByClient(clientId);
    }

    public AccountDTO save(AccountDTO accountDTO) {
        return accountRepository.save(accountDTO);
    }

    public boolean delete(int accountId) {
        return getAccountDTO(accountId).map(account -> {
            accountRepository.delete(accountId);
            return true;
        }).orElse(false);
    }
}
