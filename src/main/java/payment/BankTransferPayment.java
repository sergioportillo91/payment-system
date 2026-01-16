package payment;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pago por TRANSFERENCIA BANCARIA por $" + amount);
    }
}
