package com.cherrow.jpa.service;

import com.cherrow.jpa.model.User;
import com.cherrow.jpa.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserJpaRepository userJpaRepository;

    public UserService(final UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public User getUser(String username) {
        return userJpaRepository.findByUsername(username)
                .orElseThrow(RuntimeException::new);
    }
}
