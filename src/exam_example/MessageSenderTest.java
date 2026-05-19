package exam_example;

public class MessageSenderTest {
    static void main(String[] args) {
        EMailSender eMailSender = new EMailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        SMSSender smsSender = new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");

        System.out.println("-----------------------------");
        eMailSender.sendMessage("javaone@naver.com");
        System.out.println("-----------------------------");
        smsSender.sendMessage("010-000-0000");
    }
}
