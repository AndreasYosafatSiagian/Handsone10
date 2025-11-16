package latihan2_ocp.good;

public class WhatsAppSender implements NotificationSender {

    @Override
    public void send(String message, String recipient) {
        System.out.println("[GOOD] Sending WhatsApp to: " + recipient);
        System.out.println("Content: " + message);
    }
}
