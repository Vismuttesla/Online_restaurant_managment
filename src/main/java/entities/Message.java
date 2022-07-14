package entities;

import java.util.UUID;

public class Message {
	private int id;
    private String text;
    private UUID customerId;
    private UUID managerId;

    public Message(String text, UUID customerId, UUID managerId) {
        this.text = text;
        this.customerId = customerId;
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Message{" +
        		"id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", customerId=" + customerId +
                ", managerId=" + managerId +
                '}';
    }
}
