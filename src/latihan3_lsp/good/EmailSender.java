package latihan3_lsp.good;

// Implementation yang FOLLOWS contract
public class EmailSender extends NotificationSender {

    // Constructor default
    public EmailSender() {
        super("EMAIL");
    }

    // Implementasi send sesuai kontrak
    @Override
    public boolean send(String recipient, String message) {
        if (recipient == null || message == null) return false;
        System.out.println("[EmailSender] ✓ Notification sent to: " + recipient);
        return true;
    }
}
