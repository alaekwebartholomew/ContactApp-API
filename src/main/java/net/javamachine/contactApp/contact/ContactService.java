package net.javamachine.contactApp.contact;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }
}
