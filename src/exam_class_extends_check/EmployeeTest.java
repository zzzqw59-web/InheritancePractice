package exam_class_extends_check;

public class EmployeeTest {
    static void main(String[] args) {
        Employees employees = new Employees("김철수", "인천 만수동", "010-6630-2401", 1500000);
        System.out.println(employees.toString());

        Manager manager = new Manager("이후나", "서울 강북구", "010-1234-5678", 2000000, 300000, "대리");
        System.out.println(manager.toString());

        System.out.println();

        Employees[] employees1 = {
                new Employees("김철수", "인천 만수동", "010-6630-2401", 1500000),
                new Manager("이후나", "서울 강북구", "010-1234-5678", 2000000, 300000, "대리")
        };

        for (int i = 0; i < employees1.length; i++) {
            System.out.println(employees1[i]);
        }

        System.out.println();

        for (Employees employees2 : employees1) {
            System.out.println(employees2);
        }
    }
}
