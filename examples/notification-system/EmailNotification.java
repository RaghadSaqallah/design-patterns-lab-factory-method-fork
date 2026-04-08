package Notification;

/**
 * Concrete implementation of Notification for Email.
 * 
 * Teaching point:
 * - Implements the send() method specifically for email.
 * - Can evolve independently without affecting other notifications.
 */
public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
