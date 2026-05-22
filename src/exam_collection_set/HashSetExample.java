package exam_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    static void main(String[] args) {
        Set<String> list = new HashSet<>();

        list.add("Java");
        list.add("Spring");
        list.add("JPA");
        list.add("Java");

        System.out.println("저장된 데이터: ");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("데이터 갯수: " + list.size());
    }
}
