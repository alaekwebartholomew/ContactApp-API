package net.javamachine.contactApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<UserProfile> working(){
        return userService.getAllUser();
    }

    @GetMapping("user/{id}")
    public Optional<UserProfile> getUser(String id){
        return userService.getUser(id);
    }

    @PostMapping("user")
    public void addUser(@RequestBody UserProfile userProfile){
        userService.saveUser(userProfile);
    }

    @PutMapping("user/{id}")
    public void updateUser(@RequestBody UserProfile userProfile, @PathVariable String id){
        userService.update(userProfile);
    }
}
