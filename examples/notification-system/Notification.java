package Notification;

/**
 * Notification interface defines the common behavior for all notification types.
 * 
 * Key teaching point:
 * - Factory Method works with this interface to create objects polymorphically.
 * - Clients (NotificationService) depend on this abstraction, not concrete classes.
 */
public interface Notification {
    void send(String message);
}
