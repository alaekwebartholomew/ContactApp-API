package net.javamachine.contactApp.contact;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import net.javamachine.contactApp.user.UserProfile;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String mobileNumber;

    // Relationship
    @ManyToOne
    private UserProfile userProfile;

    public Contact() {
    }

    public Contact(String id, String name, String mobileNumber, String userProfileId) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userProfile = new UserProfile(userProfileId, "", "");
    }

    public String getContactId() {
        return id;
    }

    public void setContactId(String id) {
        this.id = id;
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

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
