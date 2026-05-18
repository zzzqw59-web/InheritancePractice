package exam_class_extends;


public class LMTest {
    static void main(String[] args) {
        Employee employee = new Employee("홍길동", 30, "입학처");
        System.out.println("employee 정보 - " + employee.toString());
        System.out.println("======================================");

        Professor professor = new Professor("김철수", 50, "자바");
        System.out.println("Professor 정보 - " + professor.toString());
        System.out.println("======================================");

        Student student = new Student("김희수", 20, "컴퓨터과학");
        System.out.println("Student 정보 - " + student.toString());
        System.out.println("======================================");

    }
}
