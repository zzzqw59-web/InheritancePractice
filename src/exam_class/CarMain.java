package exam_class;

public class CarMain {
    static void main(String[] args) {
        Monata monata1 = new Monata("흰색", 5000, "승용", "NF");
        Monata monata2 = new Monata("은색", 7000, "업무", "Brilliant");
        Monata monata3 = new Monata("감홍색", 4000, "택시", "EF");
        Monata monata4 = new Monata("검정색", 6000, "승용", "Hybrid");

        System.out.println(monata1.toString());
        System.out.println(monata2.toString());
        System.out.println(monata3.toString());
        System.out.println(monata4.toString());
    }
}
