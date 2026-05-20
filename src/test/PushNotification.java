package test;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("푸시 알림: " + message);
    }
}
