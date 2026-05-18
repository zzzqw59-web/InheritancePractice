package exam_class;

public class PersonMain {
    static void main(String[] args) {
        Person person = new Person("홍길동", 56);
        Student student = new Student("한늘봄", 41, 99010001);
        ForeignStudent foreignStudent = new ForeignStudent("Olivia", 39, 97060004, "U.S.A");

        System.out.println("사람" + person.show() + "]");
        System.out.println("학생" + student.show() + "]");
        System.out.println("외국학생" + foreignStudent.show() + "]");
    }
}
