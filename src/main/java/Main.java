import payment.*;
import repository.*;
import repository.impl.*;
import service.PaymentService;

public class Main {

    public static void main(String[] args) {

        PaymentMethod method = new CreditCardPayment();
        PaymentRepository repository = new InMemoryPaymentRepository();

        PaymentService service =
                new PaymentService(method, repository);

        service.processPayment(120_000);
    }
}
