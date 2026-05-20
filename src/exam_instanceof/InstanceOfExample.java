package exam_instanceof;

public class InstanceOfExample {
    static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();
        method1(parentB);
        // method2(parentB); //ClassCastException 발생
    }


    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.field2 = "Child로 변환 성공";
            System.out.println("method1 = " + child.field2);
        } else {
            System.out.println("method1 = Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        child.field2 = "Child로 변환 성공";
        System.out.println("method2 = " + child.field2);
    }
}
