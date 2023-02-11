package net.javamachine.contactApp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("user/{id)/contact")
    public List<Contact> getAllContact(@PathVariable String userProfileId){
        return contactService.getContacts(userProfileId);
    }

    @GetMapping("user/{id}/contact/{id}")
    public Optional<Contact> getContact(@PathVariable String id){
        return contactService.getContactById(id);
    }

    @PostMapping("user/{id}/contact")
    public void createContact(@RequestBody Contact contact){
        contactService.saveContact(contact);
    }

    @PutMapping("user/{id}/contact/{id}")
    public void updateContact(@PathVariable String id, @RequestBody Contact contact){
        contactService.update(id, contact);
    }

    @DeleteMapping("user/{id}/contact/{id}")
    public void deleteContact(@PathVariable String id){
        contactService.delete(id);
    }
}
