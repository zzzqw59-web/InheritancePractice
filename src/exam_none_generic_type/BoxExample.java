package exam_none_generic_type;

import exam_polymorphism.A;

public class BoxExample {
    static void main(String[] args) {
        Box box = new Box();

        // box.set(new String("홍길동"));
        box.set("홍길동");
        String name = (String) box.get();
        System.out.println("name = " + name);

        // 1-1. Box에 정수형의 값(5) 대입
        // Integer iNum = Integer.valueof(5); // 박싱
        // box.set(iNum);
        box.set(Integer.valueOf(5));
        Integer i = (Integer) box.get();
        System.out.println("i = " + i.intValue()); // 언박싱

        // 1-2. Box에 정수형의 값(5) 대입
        box.set(5); // 오토박싱(기초형 -> 참조형)
        int iValue = (Integer) box.get(); // 오토언박싱(참조형 -> 기초형)
        System.out.println("iValue = " + iValue);

        // 2-1. Box에 실수형의 값(8.4) 대입
        Double dNum = Double.valueOf(8.4);
        box.set(dNum);
        Double d = (Double) box.get();
        System.out.println("d = " + d);

        // 2-2. Box에 실수형의 값(8.4) 대입
        // box.set(Double.valueOf(8.4));
        box.set(8.4);
        double dValue = (Double) box.get();
        System.out.println("dValue = " + dValue);

        Character ch = Character.valueOf('잠');
        box.set(ch);
        Character c = (Character) box.get();
        System.out.println("c = " + c);

        box.set('잠');
        char cValue = (Character) box.get();
        System.out.println("cValue = " + cValue);

        box.set(new Apple("빨간색"));
        Apple apple = (Apple) box.get();
        System.out.println(apple);

        String str = "java";
        box.set(str);
        System.out.println("값: " + (String) box.get());




    }
}
