package exam_inheritance;

public class Employee extends Person {
    private String departmentName;

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
