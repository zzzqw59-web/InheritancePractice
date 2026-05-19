package test;

public class CastingMain6 {
    static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    static void call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스일 경우 Child 메서드 실행
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스가 맞다.");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아니다.");
        }
    }
}
