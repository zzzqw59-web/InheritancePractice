package exam_generic_type;

public class MyMathExample {
    static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6};

        // Integer 클래스는 Number의 하위 클래스
        MyMath<Integer> m = new MyMath<>();
        System.out.println(m.getAverage(list));

        Double[] data = {6.9, 9.2, 5.3};
        // Double 클래스는 Number의 하위 클래스
        MyMath<Double> m1 = new MyMath<>();
        System.out.printf("%.1f", m1.getAverage(data));
    }
}
