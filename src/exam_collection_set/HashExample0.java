package exam_collection_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashExample0 {
    static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();

        // put(key, value): 원소 추가
        dic.put("고진감래", "고생 끝에 즐거움이 옴");
        dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
        dic.put("권토중래", "실패를 발판삼아 재기함");
        dic.put("교학상자", "가르치고 배우면서 서로 성장함");
        // dic.put(null, null); // HashMap은 null 저장 가능

        // get(key): 특정 키의 value를 반환하는 메서드
        System.out.println(dic.get("고진감래"));
        System.out.println();

        System.out.println("총 Entry의 수: " + dic.size());

        // 객체 삭제
        dic.remove("교학상자");
        System.out.println("총 Entry의 수: " + dic.size());

        System.out.println(dic.toString());
        System.out.println();

        // 1. 객체를 하나씩 처리
        Set<String> keySet = dic.keySet(); // keySet()은 모든 키를 Set 객체에 담아서 리턴
        Iterator<String> keys = keySet.iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("%s : %s", key, dic.get(key)));
        }
        System.out.println();

        // 2. 키와 값의 한 쌍으로 구성된 객체를 Set에 담아서 리턴

    }
}
