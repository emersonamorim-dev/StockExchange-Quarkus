package org.StockExchange.Service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import org.StockExchange.Model.Transaction;
import org.StockExchange.Repository.TransactionRepository;

@ApplicationScoped
public class TransactionService {

    @Inject
    TransactionRepository transactionRepository;

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAllTransactions();
    }

    public void addTransaction(Transaction transaction) {
        transactionRepository.createTransaction(transaction);
    }

    public void modifyTransaction(Transaction transaction) {
        transactionRepository.updateTransaction(transaction);
    }

    public void removeTransaction(Long id) {
        transactionRepository.deleteTransaction(id);
    }
}
