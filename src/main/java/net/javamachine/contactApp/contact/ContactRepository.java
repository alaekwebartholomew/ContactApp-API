package net.javamachine.contactApp.contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, String> {
    public List<Contact> findByUserProfileId(String userProfileId);
}
