package exam_abstract_class;

public class PaymentTest {
    static void main(String[] args) {
        CardPayment cardPayment = new CardPayment(10000);
        cardPayment.printAmount();
        cardPayment.pay();
        System.out.println();

        KakaoPay kakaoPay = new KakaoPay(5000);
        kakaoPay.printAmount();
        kakaoPay.pay();
    }
}
