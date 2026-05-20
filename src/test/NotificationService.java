package test;

public class NotificationService {
    void notify(Notification notification, String message) {
        notification.send(message);
    }
}
