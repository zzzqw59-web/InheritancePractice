package exam_collection_list;

import java.util.ArrayList;

public class ArrayListTest {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java"); // 0
        list.add("Java"); // 1
        list.add("JSP"); // 2
        list.add("SPRING"); // 3

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        list.add(1, "oracle");
        list.set(2, "Client prgraming");
        // list.delete(3);
        String data = list.remove(3);
        System.out.println("삭제된 원소: " + data);

        int index = list.indexOf("Java");
        System.out.println(index);

        index = list.lastIndexOf("Java");
        System.out.println(index);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("list가 가진 모든 원소를 문자열로 반환");
        System.out.println(list);
        System.out.println();

        // 정수 값을 저장하도록 인스턴스 생성
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(23);
        list1.add(94);
        list1.add(Integer.valueOf(62));
        list1.add(Integer.valueOf(45));

        System.out.println();

        list1.add(2, Integer.valueOf(78));
        System.out.println(list1);
        System.out.println();

        // Apple이라는 이름으로 클래스를 생성한다. 이 클래스는 품종과 색상을 필드로 가진다.
        // 여러 사과를 저장하도록 인스턴스를 생성하여 출력하시오.

        ArrayList<Apple> list2 = new ArrayList<>();
        list2.add(new Apple("부사", "빨강"));
        list2.add(new Apple("아오리", "청색"));
        list2.add(new Apple("썸머킹", "황금"));
        list2.add(new Apple("홍로", "빨간"));

        // 1. 출력
        for (int i = 0; i < list2.size(); i++) {
            System.out.print("품종: " + list2.get(i).getKind());
            System.out.println(", 색상: " + list2.get(i).getColor());
        }
        System.out.println();

        // 2. 출력
        for (int i = 0 ; i < list2.size(); i++) {
            Apple app = list2.get(i);
            System.out.print("품종: " + app.getKind());
            System.out.println(", 색상: " + app.getColor());
        }
        System.out.println();

        // 3. 출력
        for (Apple apple : list2) {
            System.out.println(apple.toString());
        }
        System.out.println();

        System.out.println("list2가 가진 모든 원소를 문자열로 변환");
        System.out.println(list2);
        System.out.println();

        ArrayList<Movie> movie = new ArrayList<>();

        movie.add(new Movie("기생충", "9.3", "봉준호", 2019));
        movie.add(new Movie("인터스텔라", "9.1", "크리스토퍼 놀란", 2014));
        movie.add(new Movie("어벤져스", "8.7", "안소리 루소", 2019));
        movie.add(new Movie("라라랜드", "8.8", "데이미언 셔젤", 2016));

        for (int i = 0; i < movie.size(); i++) {

        }
    }
}
