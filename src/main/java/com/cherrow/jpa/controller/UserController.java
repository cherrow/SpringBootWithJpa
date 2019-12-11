package com.cherrow.jpa.controller;

import com.cherrow.jpa.model.User;
import com.cherrow.jpa.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{username}")
    public ResponseEntity<User> retrieveUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.getUser(username));
    }

}
