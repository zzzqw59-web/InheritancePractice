package exam_class;

public class CarMain {
    static void main(String[] args) {
        Monata[] monatas = new Monata[] {
                new Monata("흰색", 5000, "승용", "NF"),
                new Monata("은색", 7000, "업무", "Brilliant"),
                new Monata("감홍색", 4000, "택시", "EF"),
                new Monata("검정색", 6000, "승용", "Hybrid"),
        };

        for (Monata monata : monatas) {
            System.out.println(monata);
        }
    }
}
