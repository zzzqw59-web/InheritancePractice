package exam_class_extends;

public class Manager extends Employee {
    private String job;
    private int bonus;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", 직급 = " + job + ", 보너스 = " + bonus;
    }
}
