package exam_inheritance;

public class InheritanceTest {
    static void main(String[] args) {
        Employee employee = new Employee();
        Professor professor = new Professor();
        Student student = new Student();

        employee.setName("홍길동");
        employee.setAge(47);
        employee.setDepartmentName("행정지원팀");

        professor.setName("김푸름");
        professor.setAge(52);
        professor.setSubject("자바");

        student.setName("김유빈");
        student.setAge(20);
        student.setMajor("자바 프로그래밍 과정");

        System.out.println(employee.toString());
        System.out.println(professor.toString());
        System.out.println(student.toString());
    }
}
