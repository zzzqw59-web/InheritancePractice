package exam_class_extends_check;

public class Manager extends Employees {
    private int bonus;
    private String job;

    public Manager(String name, String address, String phoneNumber, int salrary, int bonus, String job) {
        super(name, address, phoneNumber, salrary);
        this.bonus = bonus;
        this.job = job;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + ", 직급: " + job + ", 보너스: " + bonus;
    }
}