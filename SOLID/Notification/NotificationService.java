package Notification;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void kirimNotifikasi(String message) {
        notifier.send(message);
    }
}
