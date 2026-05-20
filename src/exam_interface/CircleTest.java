package exam_interface;

public class CircleTest {
    static void main(String[] args) {
        Circle circle1 = new Circle(5.7);
        Circle circle2 = new Circle(8.9);

        if (circle1.getRadius() > circle2.getRadius()) {
            System.out.println("첫번째 원의 반지름이 두번째 원의 반지름보다 크다.");
        } else if (circle1.getRadius() == circle2.getRadius()) {
            System.out.println("두 원의 반지름이 같다.");
        } else {
            System.out.println("첫번째 원의 반지름이 두번째 원의 반지름보다 작다.");
        }

    }
}
