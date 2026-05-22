package exam_collection_set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetInterfaceTest {
    static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        LinkedList<String> set = new LinkedList<>();
        TreeSet<String> set = new TreeSet<>();

        set.add("Milk");
        set.add("Breed");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(Integer.valueOf(3));
        set1.add(5);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
    }
}
