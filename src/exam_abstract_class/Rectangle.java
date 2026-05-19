package exam_abstract_class;

public class Rectangle extends Shape {
    int width;
    int height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}
