package exam_abstract_class;

public class Circle extends Shape {
    int radius;

    @Override
    public void draw() {
        System.out.println("원 그리기 메서드");
    }
}
