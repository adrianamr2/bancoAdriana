package cuentasbancos.bancogestion.persistence.crud;

import cuentasbancos.bancogestion.persistence.entity.Cuenta;
import cuentasbancos.bancogestion.persistence.entity.Transaccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransaccionCrudRepositoryI extends CrudRepository<Transaccion, Integer> {
    List<Transaccion> findByIdTransaccion(int idTransaccion);
}
