package Notification;

/**
 * Main class demonstrating the Factory Method pattern.
 * 
 * Teaching points:
 * - Shows scaling with multiple notification types.
 * - Illustrates Open/Closed Principle in action.
 * - Highlights decoupling between service and concrete notifications.
 */
public class Main {

    public static void main(String[] args) {
        // Using Factory Method to create notifications

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        emailService.sendNotification("Hello Maryam from Email!");

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        smsService.sendNotification("Hello SMS!");

        NotificationService pushService = new NotificationService(new PushNotificationFactory());
        pushService.sendNotification("Hello Push!");

        NotificationService whatsAppService = new NotificationService(new WhatsAppNotificationFactory());
        whatsAppService.sendNotification("Hello WhatsApp!");
    }
}
