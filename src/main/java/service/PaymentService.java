package service;

import payment.PaymentMethod;
import repository.PaymentRepository;

public class PaymentService {

    private final PaymentMethod paymentMethod;
    private final PaymentRepository repository;

    public PaymentService(
            PaymentMethod paymentMethod,
            PaymentRepository repository
    ) {
        this.paymentMethod = paymentMethod;
        this.repository = repository;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
        repository.save(amount);
    }
}
