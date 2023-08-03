package org.StockExchange.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.StockExchange.Model.Transaction;
import org.StockExchange.Service.TransactionService;

@Path("/transactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransactionController {

    @Inject
    TransactionService transactionService;

    @GET
    @Path("/{id}")
    public Transaction getTransaction(@PathParam("id") Long id) {
        return transactionService.getTransactionById(id);
    }

    @GET
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @POST
    public void addTransaction(Transaction transaction) {
        transactionService.addTransaction(transaction);
    }

    @PUT
    public void modifyTransaction(Transaction transaction) {
        transactionService.modifyTransaction(transaction);
    }

    @DELETE
    @Path("/{id}")
    public void removeTransaction(@PathParam("id") Long id) {
        transactionService.removeTransaction(id);
    }
}
