package org.StockExchange.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import org.StockExchange.Model.Transaction;

@ApplicationScoped
public class TransactionRepository implements PanacheRepository<Transaction> {

    public Transaction findById(Long id) {
        return find("id", id).firstResult();
    }

    public List<Transaction> findAllTransactions() {
        return listAll();
    }

    public void createTransaction(Transaction transaction) {
        persist(transaction);
    }

    public void updateTransaction(Transaction transaction) {
        if (transaction.getId() != null) {
            Transaction existingTransaction = findById(transaction.getId());
            if (existingTransaction != null) {
                existingTransaction.setSymbol(transaction.getSymbol());
                existingTransaction.setQuantity(transaction.getQuantity());
                existingTransaction.setPrice(transaction.getPrice());
                existingTransaction.setType(transaction.getType());
            }
        }
    }

    public void deleteTransaction(Long id) {
        deleteById(id);
    }
}
