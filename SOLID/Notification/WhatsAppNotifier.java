package Notification;

public class WhatsAppNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim pesan WhatsApp: " + message);
    }
}
