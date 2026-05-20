package test;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("SMS로 메세지 전송!: " + message);
    }
}
