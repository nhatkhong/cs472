package repository;

import model.ContactMessage;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {

    private static MessageRepository messageRepository = null;
    private List<ContactMessage> contactMessages;

    public MessageRepository() {
        this.contactMessages = new ArrayList<ContactMessage>();
        this.contactMessages.add(new ContactMessage("Gemi Khong", "Male", "Feedback", "This is good"));
        this.contactMessages.add(new ContactMessage("Maria Thomas", "Female", "Inquiry", "Is this good?"));
        this.contactMessages.add(new ContactMessage("Robbin Trump", "Male", "Complaint", "This is to long"));
        this.contactMessages.add(new ContactMessage("Artena Angelina", "Female", "Feedback", "This is great"));
        this.contactMessages.add(new ContactMessage("John Smith", "Male", "Complaint", "Customer service is bad"));
    }

    public static MessageRepository getInstance() {
        if (messageRepository == null)
            messageRepository = new MessageRepository();
        return messageRepository;
    }

    public List<ContactMessage> getContactMessages() {
        return contactMessages;
    }

    public void addMessage(ContactMessage newMessage) {
        contactMessages.add(newMessage);
    }
}
