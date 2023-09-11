package cuentasbancos.bancogestion.persistence.crud;

import cuentasbancos.bancogestion.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepositoryI extends CrudRepository<Cliente, Integer> {
    List<Cliente> findByIdCliente(int idCliente);
}
