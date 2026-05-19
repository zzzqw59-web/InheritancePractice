package exam_abstract_class;

public class CardPayment extends Payment {
    CardPayment(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("카드로 결제합니다.");
    }
}
