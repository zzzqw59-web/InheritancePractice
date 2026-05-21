package exam_multi_type_parameter;

public class SmartPhone {
    private String company;
    private String OS;

    public SmartPhone(String company, String OS) {
        this.company = company;
        this.OS = OS;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return " [" + company + ", " + OS + "]";
    }
}
