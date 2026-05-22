package exam_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> list = new ArrayList<>();

        System.out.println("10명의 점수를 입력하시오. (0.0 ~ 10.0)");

        for (int i = 0; i < 10; i++) {
            double value = input.nextDouble();
            while (true) {
                if (value > 10.0 || value < 0.0) {
                    System.out.println("값을 다시 입력하세요.");
                    value = input.nextDouble();
                }
                else {
                    break;
                }
            }
            list.add(value);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("(" + (i + 1) + "번) 심사위원의 점수: " + list.get(i));
        }

        double max = Collections.max(list);
        double min = Collections.min(list);

        int maxIndex = list.indexOf(max);
        list.remove(maxIndex);

        int minIndex = list.indexOf(min);
        list.remove(minIndex);

        double sum = 0.0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println();

        System.out.printf("점수의 합: %.1f", sum);

        input.close();

    }
}

