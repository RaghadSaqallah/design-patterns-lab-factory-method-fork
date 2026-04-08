package Notification;

/**
 * Abstract Factory class for Notifications.
 * 
 * Key teaching point:
 * - Defines the Factory Method `createNotification()`.
 * - Subclasses decide which concrete Notification to instantiate.
 * - Enables Open/Closed Principle: extendable without modifying existing code.
 */
public abstract class NotificationFactory {

    // Factory Method
    public abstract Notification createNotification();
}
