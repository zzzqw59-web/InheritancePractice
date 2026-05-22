package poly.toString;

public class ToStringMain2 {
    static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 5);
        Dog dog2 = new Dog("멍멍이2", 6);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. object 다형성 활용");
        System.out.print(car);
        System.out.print(dog1);
        System.out.print(dog2);

        System.identityHashCode(dog1);

    }
}
