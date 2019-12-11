package com.cherrow.jpa.controller;

import com.cherrow.jpa.dto.LoginDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok().build();
    }
}
