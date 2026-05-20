package test;

public class PaymentMain {
    static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        Payment card = new CardPayment();
        Payment kakao = new KakaoPayment();

        paymentService.process(card, 5000);
        paymentService.process(kakao, 10000);
    }
}
