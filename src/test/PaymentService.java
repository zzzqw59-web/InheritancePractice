package test;

public class PaymentService {
    void process(Payment payment, int amount) {
        payment.pay(amount);
    }
}
