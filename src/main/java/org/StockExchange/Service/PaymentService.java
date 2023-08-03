package org.StockExchange.Service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import org.StockExchange.Model.Payment;
import org.StockExchange.Repository.PaymentRepository;

@ApplicationScoped
public class PaymentService {

    @Inject
    PaymentRepository paymentRepository;

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAllPayments();
    }

    public void addPayment(Payment payment) {
        paymentRepository.createPayment(payment);
    }

    public void modifyPayment(Payment payment) {
        paymentRepository.updatePayment(payment);
    }

    public void removePayment(Long id) {
        paymentRepository.deletePayment(id);
    }
}

