package latihan3_lsp;

import latihan3_lsp.good.EmailSender;
import latihan3_lsp.good.SmsSender;
import latihan3_lsp.good.NotificationSender;

public class LSPPractice {

    public static void main(String[] args) {

        System.out.println("=== GOOD PRACTICE: Mengikuti LSP ===\n");

        // Gunakan constructor dari good classes
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SmsSender();

        testSender(emailSender, "user@example.com", "Hello via Email");
        testSender(smsSender, "081234567890", "Hello via SMS");
    }

    private static void testSender(NotificationSender sender, String recipient, String message) {
        boolean success = sender.send(recipient, message);
        if (success) {
            System.out.println("  → Success!");
        } else {
            System.out.println("  → Failed to send notification");
        }
    }
}
