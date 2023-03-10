package net.javamachine.contactApp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    public List<Contact> getContacts(String userProfileId) {
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findByUserProfileId(userProfileId).forEach(contacts::add);
        return contacts;
    }

    public Optional<Contact> getContactById(String id) {
        return contactRepository.findById(id);
    }

    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    public void update(Contact contact) {
        contactRepository.save(contact);
    }

    public void delete(String id) {
        contactRepository.deleteById(id);
    }
}
