package exam_interface.example;

public class Circle implements Comparable{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;

        if (this.radius > c.radius) {
            return 1;
        } else if (this.radius == c.radius) {
            return 0;
        } else {
            return -1;
        }
    }
}

