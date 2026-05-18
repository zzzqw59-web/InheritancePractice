package exam_class;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String show() {
        return super.show() + ", 학번: " + studentNumber;
    }
}
