package net.javamachine.contactApp.contact;

import net.javamachine.contactApp.user.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("user/{userProfileId}/contact")
    public List<Contact> getAllContact(@PathVariable String userProfileId){
        return contactService.getContacts(userProfileId);
    }

    @GetMapping("user/{userProfileId}/contact/{id}")
    public Optional<Contact> getContact(@PathVariable String id){
        return contactService.getContactById(id);
    }

    @PostMapping("user/{userProfileId}/contact")
    public void createContact(@PathVariable String userProfileId, @RequestBody Contact contact){
        contact.setUserProfile(new UserProfile(userProfileId, "", ""));
        contactService.saveContact(contact);
    }

    @PutMapping("user/{userProfileId}/contact/{id}")
    public void updateContact(@PathVariable String userProfileId, @PathVariable String id, @RequestBody Contact contact){
        contact.setUserProfile(new UserProfile(userProfileId, "", ""));
        contactService.update(contact);
    }

    @DeleteMapping("user/{userProfileId}/contact/{id}")
    public void deleteContact(@PathVariable String userProfileId, @PathVariable String id){
        contactService.delete(id);
    }
}
