package exam_class_extends;

public class EmployeeTest {
    static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.setName("김철수");
        employee.setAddress("서울시 영등포구 당산 6가");
        employee.setPhoneNumber("010 - 2353 - 3245");
        employee.setSalary(1500000);

        manager.setName("홍길동");
        manager.setAddress("서울시 성동구");
        manager.setPhoneNumber("010 - 7869 - 0987");
        manager.setSalary(2000000);
        manager.setJob("대리");
        manager.setBonus(100000);

        System.out.println(employee.toString());
        System.out.println(manager.toString());

    }
}
