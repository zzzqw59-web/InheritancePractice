package exam_interface;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        // 5개의 숫자를 오름차순으로 정렬하여 출력하는 코드를 작성해주세요.
        int[] numbers = {60, 88, 10, 45, 90};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // 3명의 학생 총점으로 오름차순으로 정렬하여 출력하는 코드를 작성하시오.
        Student[] students = new Student[3];
        students[0] = new Student("김철수", 270);
        students[1] = new Student("이영희", 330);
        students[2] = new Student("박진아", 520);
//        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
