package exam_abstract_class;

public class AbstractShapeTest {
    static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();

        // 추상클래스는 인스턴스 생성이 불가능하다
        // Shape shape = new Shape()
    }
}
