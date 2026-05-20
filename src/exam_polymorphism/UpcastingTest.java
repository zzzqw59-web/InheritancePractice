package exam_polymorphism;

public class UpcastingTest {
    static void main(String[] args) {
        Sqare sqare = new Sqare();
        sqare.name = "직사각형";
        System.out.println(sqare.name);

        Triangle triangle = new Triangle();
        triangle.name = "삼각형";
        System.out.println(triangle.name);

        Circle circle = new Circle();
        circle.name = "원";
        System.out.println(circle.name);
        System.out.println();

        Shape[] shapes = {
                new Sqare("직사각형"),
                new Triangle("삼각형"),
                new Circle("원"),
        };

        for (int i = 0 ; i < shapes.length; i++) {
            System.out.println(shapes[i].name);
        }

    }
}
