package Notification;

public class PushNotificationNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Push Notification: " + message);
    }
}
