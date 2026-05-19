package exam_abstract_class;

public class CarTest {
    static void main(String[] args) {
        System.out.println("==== 자율주행 하는 자동차 ====");
        AICar aiCar = new AICar();
        aiCar.run();

        System.out.println("==== 사람이 운전하는 자동차 ====");
        ManualCar manualCar = new ManualCar();
        manualCar.run();
    }
}
