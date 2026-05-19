package exam_interface_example;

public class AppCDInfo extends CDinfo implements Lendable{
    private String borrowser;
    private String checkOutDate;
    private String state;

    public AppCDInfo(String registerNo, String title, String borrowser, String checkOutDate, String state) {
        super(registerNo, title);
        this.borrowser = borrowser;
        this.checkOutDate = checkOutDate;
        this.state = state;
    }

    public String getBorrowser() {
        return borrowser;
    }

    public void setBorrowser(String borrowser) {
        this.borrowser = borrowser;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void checkOut(String borrowser, String data) {
        System.out.println(getTitle() + "CD가 대출되었습니다.");
        System.out.println("대출인: " + borrowser);
        System.out.println("대출일: " + data);
        System.out.println();
        System.out.println("등록 번호 = " + getRegisterNo() + ", 제목 = " + getTitle() + ", 대출자 = " + borrowser + ", 대출일 = " + data + ", 상태 = " + state);
    }

    @Override
    public void checkIn() {
        System.out.println(getTitle() + "이(가) 반납되었습니다.");
    }
}
