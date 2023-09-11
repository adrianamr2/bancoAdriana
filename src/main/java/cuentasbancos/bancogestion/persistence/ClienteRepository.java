package cuentasbancos.bancogestion.persistence;

import cuentasbancos.bancogestion.persistence.crud.ClienteCrudRepositoryI;
import cuentasbancos.bancogestion.persistence.entity.Cliente;
import cuentasbancos.bancogestion.persistence.entity.Cuenta;

import java.util.List;
import java.util.Optional;

public class ClienteRepository {
    private ClienteCrudRepositoryI clienteCrudRepositoryI;
    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepositoryI.findAll();
    }

}
