package exam_interface;

public class Student implements Comparable {
    private String name;
    private int total;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        Student student = (Student) obj;

        // 총점 기준
        if (this.total < student.total) {
            return -1;
        } else if (this.total == student.total) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "이름 = " + name + ", 총점 = " + total;
    }
}
