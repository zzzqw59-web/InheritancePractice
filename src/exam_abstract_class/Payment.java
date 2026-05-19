package exam_abstract_class;

public abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public void printAmount() {
        System.out.println("결제금액: " + amount + "원");
    }

    public abstract void pay();
}
