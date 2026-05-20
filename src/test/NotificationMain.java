package test;

public class NotificationMain {
    static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.notify(new SmsNotification(), "안녕하세요");
        notificationService.notify(new EmailNotification(), "환영합니다.");
        notificationService.notify(new PushNotification(), "알림입니다");
    }
}
