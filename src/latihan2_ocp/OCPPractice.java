package latihan2_ocp;

import latihan2_ocp.bad.NotificationService;
import latihan2_ocp.good.*;

public class OCPPractice {
    public static void main(String[] args) {

        System.out.println("=== BAD PRACTICE: Melanggar OCP ===\n");

        // Memanggil versi BAD
        NotificationService badService = new NotificationService();

        badService.sendNotification("Hello from BAD", "EMAIL", "user@example.com");
        badService.sendNotification("Hello from BAD", "SMS", "081234567890");
        badService.sendNotification("Test Error", "WHATSAPP", "08123");

        System.out.println("\n--- Analisis Masalah (BAD) ---");
        System.out.println("Jika ingin tambah channel baru:");
        System.out.println("❌ Harus modify method sendNotification()");
        System.out.println("❌ Harus tambah else-if baru");
        System.out.println("❌ Berisiko merusak kode lama");
        System.out.println("❌ Setiap channel baru = modify existing code");
        System.out.println("\nBAD => MELANGGAR Open-Closed Principle!");

        System.out.println("\n====================================================\n");

        System.out.println("=== GOOD PRACTICE: Mengikuti OCP ===\n");

        latihan2_ocp.good.NotificationService goodService =
                new latihan2_ocp.good.NotificationService();

        // Tambahkan channel secara EXTEND, bukan modify
        goodService.addSender(new EmailSender());
        goodService.addSender(new SmsSender());
        goodService.addSender(new WhatsAppSender());

        goodService.sendToAll("Hello from GOOD", "user@example.com");

        System.out.println("\nGOOD => Sesuai Open-Closed Principle!");
        System.out.println("✔ Tambah channel baru tanpa mengubah kode lama.");
    }
}
