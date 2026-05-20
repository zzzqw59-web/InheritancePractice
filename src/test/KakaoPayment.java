package test;

public class KakaoPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("카카오 페이로 " + amount + "원 결제");
    }
}
