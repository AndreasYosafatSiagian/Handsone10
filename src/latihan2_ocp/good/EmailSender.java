package latihan2_ocp.good;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("[GOOD] Sending EMAIL to: " + recipient);
        System.out.println("Content: " + message);
    }
}
