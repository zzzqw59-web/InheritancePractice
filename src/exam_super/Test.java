package exam_super;

public class Test {
    static void main(String[] args) {
        Circle c = new Circle();
    }
}

class Circle extends shape {
    public Circle() {
        super();
        System.out.println("하위클래스");
    }
}

class shape {
    public shape() {
        System.out.println("상위 클래스");
    }
}
