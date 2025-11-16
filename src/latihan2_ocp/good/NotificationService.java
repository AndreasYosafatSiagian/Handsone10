package latihan2_ocp.good;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<NotificationSender> senders = new ArrayList<>();

    public void addSender(NotificationSender sender) {
        senders.add(sender);
    }

    public void sendToAll(String message, String recipient) {
        for (NotificationSender sender : senders) {
            sender.send(message, recipient);
        }
    }
}
