package latihan2_NotificationService.java.bad;

// Class ini MELANGGAR OCP karena setiap channel baru harus modify code ini
public class NotificationService {

    public void sendNotification(String message, String type, String recipient) {

        // Masalah: If-else chain yang terus bertambah setiap ada channel baru
        if (type.equalsIgnoreCase("EMAIL")) {
            System.out.println("Sending EMAIL to: " + recipient);
            System.out.println("Content: " + message);

        } else if (type.equalsIgnoreCase("SMS")) {
            System.out.println("Sending SMS to: " + recipient);
            System.out.println("Content: " + message);

        } else {
            System.out.println("ERROR: Notification type '" + type + "' tidak dikenali!");
        }
    }
}
