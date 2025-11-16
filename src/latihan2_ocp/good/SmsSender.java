package latihan2_ocp.good;

public class SmsSender implements NotificationSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("[GOOD] Sending SMS to: " + recipient);
        System.out.println("Content: " + message);
    }
}
