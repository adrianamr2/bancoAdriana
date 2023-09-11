package cuentasbancos.bancogestion.persistence.crud;

import cuentasbancos.bancogestion.persistence.entity.Cuenta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CuentaCrudRepositoryI extends CrudRepository<Cuenta, Integer> {

    List<Cuenta> findByIdCliente(int idCliente);
}
