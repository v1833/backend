package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    private final ArrayList<User> users = new ArrayList<>();

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        users.add(user);
    }

    //todo return proper status codes
    //todo return id after post

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable long id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                break;
            }
        }
    }

    @GetMapping("/users")
    public ArrayList<User> getAll(){
        return users;
    }
}
