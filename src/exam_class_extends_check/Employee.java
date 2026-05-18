package exam_class_extends_check;

public class Employee extends Person {
    private String departmentName;

    Employee () {
        super();
        System.out.println("Employee 생성자 호출");
    }

    public Employee(String name, int age, String departmentName) {
        super(name, age);
        this.departmentName = departmentName;
        System.out.println("Employee(name, age, depart) 생성자 호출");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + getDepartmentName();
    }
}
