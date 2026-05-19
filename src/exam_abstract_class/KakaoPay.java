package exam_abstract_class;

public class KakaoPay extends Payment {
    public KakaoPay(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("카카오페이로 결제합니다.");
    }
}
