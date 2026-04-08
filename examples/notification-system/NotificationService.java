package Notification;

/**
 * NotificationService is the client that uses a NotificationFactory to send notifications.
 * 
 * Key teaching points:
 * - Decouples creation from usage.
 * - Relies on the factory, not concrete notification types.
 * - Adding new notifications does not require modifying this class.
 */
public class NotificationService {

    private NotificationFactory factory;

    // Inject the factory into the service
    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    // Send a notification using the factory
    public void sendNotification(String message) {
        Notification notification = factory.createNotification(); // Factory creates the object
        notification.send(message); // Polymorphic behavior
    }
}
