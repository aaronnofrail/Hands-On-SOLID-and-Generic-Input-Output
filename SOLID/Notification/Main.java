package Notification;

public class Main {
    public static void main(String[] args) {
        new NotificationService(new EmailNotifier()).kirimNotifikasi("Halo, ini email test!");
        new NotificationService(new SMSNotifier()).kirimNotifikasi("Ini SMS test!");
        new NotificationService(new WhatsAppNotifier()).kirimNotifikasi("Ini pesan WhatsApp test!");
        new NotificationService(new TelegramNotifier()).kirimNotifikasi("Ini pesan Telegram test!");
    }
}
