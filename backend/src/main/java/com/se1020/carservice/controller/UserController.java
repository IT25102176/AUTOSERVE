package com.se1020.carservice.controller;

import com.se1020.carservice.model.User;
import com.se1020.carservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable String id) {
        return userService.getById(id);
    }

    @GetMapping("/customer-login")
    public User customerLogin(@RequestParam String phone) {
        return userService.getCustomerByPhone(phone);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        userService.delete(id);
    }
}
