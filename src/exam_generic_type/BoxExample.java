package exam_generic_type;

public class BoxExample {
    static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello");
        // Box<String> box1 = new Box<>(new String("Hello"));

        String str = box1.getData();
        System.out.println(str);

        // 정수 자료형으로 설정 후 6을 대입
        // Box<int> box2 = new Box<int>(); // 타입 매개변수에는 기본형을 사용할 수 없다.
        Box<Integer> box2 = new Box<>();
        // box2.get(Integer.valueOf(6)); // 기초형 => 참조형 : 박싱
        box2.setData(6); // 오토박싱
        // int value = box2.get().intValue(); // 참조형 => 기초형 : 언박싱
        int value = box2.getData(); // 오토 언박싱
        System.out.println(value);

        // 생성한 Apple 클래스를 설정 후 청색사과를 대입
        // Box<Apple> box3 = new Box<Apple>();
        // box3.set(new Apple("청색"));
        Box<Apple> box3 = new Box<Apple>(new Apple("청색"));

        Apple app = box3.getData();
        System.out.println(app.toString());

        Box<Double> box4 = new Box<Double>();
        // box4.set(Double.valueOf(3.6));
        box4.setData(3.6);
        // double data = box4.get().doubleValue();
        double data = box4.getData();
        System.out.println(data);

        Box<Integer> box5 = new Box<Integer>();
        // box5.set(5.7);
        box5.setData(5);
        System.out.println(box5.getData());
    }

}
