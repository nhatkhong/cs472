package service;

import model.ContactMessage;
import repository.MessageRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContactMessageService {
    private MessageRepository messageRepository;

    public ContactMessageService() {
        messageRepository = MessageRepository.getInstance();
    }

    public List<ContactMessage> getContactMessages() {
        return this.messageRepository.getContactMessages();
    }

    public List<ContactMessage> getContactMessagesSorted() {

        return this.messageRepository.getContactMessages().stream()
                .sorted(Comparator.comparing(ContactMessage::getFullName))
                .collect(Collectors.toList());
    }

    public List<ContactMessage> filterMessages(String searchString) {
        String lowerCaseSearchString = searchString.toLowerCase();
        return getContactMessagesSorted().stream().filter(x -> x.getFullName().toLowerCase().contains(lowerCaseSearchString)
                || x.getCategory().toLowerCase().contains(lowerCaseSearchString)
                || x.getGender().toLowerCase().contains(lowerCaseSearchString)
                || x.getMessage().toLowerCase().contains(lowerCaseSearchString))
                .collect(Collectors.toList());
    }

    public void addMessage(ContactMessage newMessage) {
        this.messageRepository.addMessage(newMessage);
    }
}
