package latihan2_ocp.bad;

public class NotificationService {

    public void sendNotification(String message, String type, String recipient) {
        if (type.equalsIgnoreCase("EMAIL")) {
            System.out.println("[BAD] Sending EMAIL to: " + recipient);
            System.out.println("Content: " + message);

        } else if (type.equalsIgnoreCase("SMS")) {
            System.out.println("[BAD] Sending SMS to: " + recipient);
            System.out.println("Content: " + message);

        } else {
            System.out.println("[BAD] ERROR: Notification type '" + type + "' tidak dikenali!");
        }
    }
}
