package test;

public class CastingMain4 {
    static void main(String[] args) {
        Parent parent1 = new Child();

        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); // 메모리상에 Child 자체가 없음

        Child child2 = (Child) parent2;
        child2.childMethod();

    }
}
