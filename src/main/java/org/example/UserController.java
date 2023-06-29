package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final ArrayList<User> users = new ArrayList<>();

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        users.add(user);
    }

    //todo 1) return proper status code 2) return id after post
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
    public List<User> getAll(){
        return users;
    }
}
