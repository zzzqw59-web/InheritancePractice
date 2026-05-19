package exam_interface_example;

public class SeperateVolume implements Lendable{
    private int requestNo;
    private String bookTitle;
    private String writer;
    private String borrower;
    private String checkOutData;
    private String state;

    public SeperateVolume(int requestNo, String bookTitle, String writer, String borrower, String checkOutData, String state) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
        this.borrower = borrower;
        this.checkOutData = checkOutData;
        this.state = state;
    }

    public int getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(int requestNo) {
        this.requestNo = requestNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getCheckOutData() {
        return checkOutData;
    }

    public void setCheckOutData(String checkOutData) {
        this.checkOutData = checkOutData;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void checkOut(String borrowser, String data) {
        System.out.println(bookTitle + "(" + writer + ") 이(가) 대출되었습니다.");
        System.out.println("대출인: " + borrowser);
        System.out.println("대출일: " + checkOutData);
        System.out.println();
        System.out.println("청구번호 = " + getRequestNo() + ", 도서명 = " + bookTitle + ", 저자 = " + writer + ", 대출자 = " + borrowser + ", 대출일 = " + data + ", 상태 = " + state);
    }

    @Override
    public void checkIn() {
        System.out.println(bookTitle + "(" + writer + ") 이(가) 반납되었습니다.");
    }
}
