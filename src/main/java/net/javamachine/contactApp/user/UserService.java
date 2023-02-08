package net.javamachine.contactApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserProfile> getAllUser(){
        List<UserProfile> usersList = new ArrayList<>();
        userRepository.findAll().forEach(usersList::add);
        return usersList;
    }

    public Optional<UserProfile> getUser(String id){
        return userRepository.findById(id);
    }

    public void saveUser(UserProfile userProfile) {
        userRepository.save(userProfile);
    }

    public void update(UserProfile userProfile) {
        userRepository.save(userProfile);
    }
}
