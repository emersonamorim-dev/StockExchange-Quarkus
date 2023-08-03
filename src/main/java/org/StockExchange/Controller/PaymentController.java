package org.StockExchange.Controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.StockExchange.Model.Payment;
import org.StockExchange.Service.PaymentService;

@Path("/payments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaymentController {

    @Inject
    PaymentService paymentService;

    @GET
    @Path("/{id}")
    public Payment getPayment(@PathParam("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @GET
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @POST
    public void addPayment(Payment payment) {
        paymentService.addPayment(payment);
    }

    @PUT
    public void modifyPayment(Payment payment) {
        paymentService.modifyPayment(payment);
    }

    @DELETE
    @Path("/{id}")
    public void removePayment(@PathParam("id") Long id) {
        paymentService.removePayment(id);
    }
}
