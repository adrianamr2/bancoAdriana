package cuentasbancos.bancogestion.domain.repository;

import cuentasbancos.bancogestion.domain.AccountDTO;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {

        List<AccountDTO> getAll();

        Optional <AccountDTO> getAccountDTO(int accountId);
        Optional<List<AccountDTO>> getByClient(int clientId);
        AccountDTO save (AccountDTO accountDTO);
        void delete (int accountId);
}
