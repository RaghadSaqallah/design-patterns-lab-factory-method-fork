package Notification;

/**
 * Concrete implementation of Notification for Push notifications.
 */
public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
