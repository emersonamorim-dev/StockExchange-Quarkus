package org.StockExchange.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import org.StockExchange.Model.Payment;

@ApplicationScoped
public class PaymentRepository implements PanacheRepository<Payment> {

    public Payment findById(Long id) {
        return find("id", id).firstResult();
    }

    public List<Payment> findAllPayments() {
        return listAll();
    }

    public void createPayment(Payment payment) {
        persist(payment);
    }

    public void updatePayment(Payment payment) {
        if (payment.getId() != null) {
            Payment existingPayment = findById(payment.getId());
            if (existingPayment != null) {
                existingPayment.setUserId(payment.getUserId());
                existingPayment.setAmount(payment.getAmount());
                existingPayment.setTimestamp(payment.getTimestamp());
            }
        }
    }

    public void deletePayment(Long id) {
        deleteById(id);
    }
}

