package exam_interface.example;

public class CircleTest {
    static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(6.0);

        if (circle1.compareTo(circle2) > 0) {
            System.out.println("첫번째 원의 반지름은 두번째 원의 반지름보다 크다.");
        } else if (circle1.compareTo(circle2) == 0) {
            System.out.println("첫번째 원의 반지름과 두번째 원의 반지름이 같다.");
        } else {
            System.out.println("첫번째 원의 반지름은 두번째 원의 반지름보다 작다.");
        }
    }
}
