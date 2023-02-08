package net.javamachine.contactApp.contact;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    private String contactId;
    private String name;
    private String mobileNumber;

    public Contact() {
    }

    public Contact(String contactId, String name, String mobileNumber) {
        this.contactId = contactId;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
