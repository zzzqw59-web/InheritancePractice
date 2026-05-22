package exam_collection_set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {
    static void main(String[] args) {
        Set<String> list = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        String[] sample = {"단어", "의미", "구절", "의미", "단락"};

        for (String s : sample) {
            if (!list.add(s)) {
                duplicate.add(s);
            }
        }

        System.out.println("중복된 단어: " + duplicate);
        System.out.println("단어 수: " + list.size());
        System.out.println("중복 되지 않은 단어: " + list);

    }
}
