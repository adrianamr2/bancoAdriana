package cuentasbancos.bancogestion.domain.repository;

import cuentasbancos.bancogestion.persistence.entity.Transaccion;
import jakarta.transaction.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository {
    List<Transaction> getAll();
    Optional<List<Transaction>> getByClient(int clientId);
    Transaction save(Transaction transaction);
}
