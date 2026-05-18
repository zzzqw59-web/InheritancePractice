package exam_class_extends_check;

public class Employees {
    private String name;
    private String address;
    private String phoneNumber;
    private int salrary;

    public Employees(String name, String address, String phoneNumber, int salrary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salrary = salrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalrary() {
        return salrary;
    }

    public void setSalrary(int salrary) {
        this.salrary = salrary;
    }

    @Override
    public String toString() {
        return "사원명: " + name + ", 주소: " + address + ", 연락처: " + phoneNumber + ", 급여: " + salrary;
    }
}
