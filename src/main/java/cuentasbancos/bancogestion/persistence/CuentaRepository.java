package cuentasbancos.bancogestion.persistence;

import cuentasbancos.bancogestion.domain.AccountDTO;
import cuentasbancos.bancogestion.domain.ClientDTO;
import cuentasbancos.bancogestion.domain.repository.AccountRepository;
import cuentasbancos.bancogestion.persistence.crud.CuentaCrudRepositoryI;
import cuentasbancos.bancogestion.persistence.entity.Cuenta;
import cuentasbancos.bancogestion.persistence.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CuentaRepository implements AccountRepository {
    @Autowired
    private CuentaCrudRepositoryI cuentaCrudRepositoryI;

    @Autowired
    private AccountMapper mapper;
    @Override
    public List<AccountDTO>getAll(){
         List<Cuenta> cuentas = (List<Cuenta>) cuentaCrudRepositoryI.findAll();
        return mapper.toAccountsDTO(cuentas);
    }
    @Override
    public Optional<List<AccountDTO>> getByClient(int clientId){
        List<Cuenta> cuentas = cuentaCrudRepositoryI.findByIdCliente(clientId);
        return Optional.of(mapper.toAccountsDTO(cuentas));
    }
    @Override
    public Optional<AccountDTO> getAccountDTO(int accountId){
        return cuentaCrudRepositoryI.findById(accountId).map(cuenta -> mapper.toAccountDTO(cuenta));
    }
    @Override
    public AccountDTO save (AccountDTO accountDTO){
        Cuenta cuenta = mapper.toCuenta(accountDTO);
        return mapper.toAccountDTO(cuentaCrudRepositoryI.save(cuenta));
    }
    @Override
    public void delete (int accountId){
        cuentaCrudRepositoryI.deleteById(accountId);
    }
}
