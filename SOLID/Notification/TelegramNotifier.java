package Notification;

public class TelegramNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim pesan Telegram: " + message);
    }
}
