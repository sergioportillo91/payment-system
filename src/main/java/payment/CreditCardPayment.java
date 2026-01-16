package payment;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pago con TARJETA DE CREDITO por $" + amount);
    }
}
