package net.javamachine.contactApp.contact;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    private ContactService contactService;

    @GetMapping("contact")
    public List<Contact> getAllContact(){
        return contactService.getContacts();
    }

    @GetMapping("contact/{id}")
    public String getContact(@PathVariable String id){
        return contactService.getContactById(id);
    }

    @PostMapping("contact")
    public void createContact(@RequestBody Contact contact){
        contactService.saveContact();
    }

    @PutMapping("contact/{id}")
    public void updateContact(@PathVariable String id, @RequestBody Contact contact){
        contactService.update(id);
    }

    @DeleteMapping("contact/{id}")
    public void deleteContact(@PathVariable String id){
        contactService.delete(id);
    }
}
