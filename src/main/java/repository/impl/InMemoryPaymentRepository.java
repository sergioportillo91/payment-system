package repository.impl;

import repository.PaymentRepository;

public class InMemoryPaymentRepository implements PaymentRepository {

    @Override
    public void save(double amount) {
        System.out.println("Pago guardado en memoria: $" + amount);
    }
}
