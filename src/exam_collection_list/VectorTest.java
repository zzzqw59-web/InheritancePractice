package exam_collection_list;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    static Vector<Movie> list = new Vector<>();
    static void main(String[] args) {
        list.addElement(new Movie("더 배트맨", "☆☆☆☆☆ 0", "맷 브리스", 2022));
        list.addElement(new Movie("나쁜 녀석들", "★★★★☆ 0", "손용호", 2019));
        list.addElement(new Movie("아쿠아맨", "☆☆☆☆☆ 0", "론 하워드", 2018));
        
        printData();
    }

    private static void printData() {
        Iterator<Movie> e = list.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
    }
}
