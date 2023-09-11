package cuentasbancos.bancogestion.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TransacctionMapper {
    /* @Mappings({
           @Mapping(source = "idTransaccion", target = "transactionId"),
            @Mapping(source = "idCuenta", target = "accountId"),
            @Mapping(source = "estado", target = "clientId"),
            @Mapping(source = "idCategoria", target = "transactionId"),
            @Mapping(source = "descripcion", target = "transactionType"),
            @Mapping(source = "estado", target = "state"),
    })*/
}
