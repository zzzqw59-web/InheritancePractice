package test;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("이메일로 메세지 전송: " + message);
    }
}
