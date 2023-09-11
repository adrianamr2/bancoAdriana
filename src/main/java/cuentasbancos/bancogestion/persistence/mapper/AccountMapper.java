package cuentasbancos.bancogestion.persistence.mapper;

import cuentasbancos.bancogestion.domain.AccountDTO;
import cuentasbancos.bancogestion.persistence.entity.Cuenta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Mappings({
            @Mapping(source = "idCuenta", target = "accountId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "tipoCuenta", target = "accountType"),
            @Mapping(source = "estado", target = "active"),
    })
    AccountDTO toAccountDTO(Cuenta cuenta);
    List<AccountDTO> toAccountsDTO(List<Cuenta> cuentas);

    @InheritInverseConfiguration
    @Mapping(target = "numeroCuenta", ignore = true)
    @Mapping(target = "saldo", ignore = true)
    //@Mapping(target = "correo", ignore = true)
    Cuenta toCuenta(AccountDTO accountDTO);
}
