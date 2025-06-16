package com.example.vims_backend.service;

import com.example.vims_backend.entity.User;
import com.example.vims_backend.repo.UserRepository;
import com.example.vims_backend.entity.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register a new user
    public User registerUser(User user) {
        // Default role
        if (user.getRole() == null) {
            user.setRole(Role.USER);
        }
        return userRepository.save(user);
    }

    // Authenticate user by email and password
    public User authenticate(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // Check if email already exists
    public boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }

    // Get user by ID
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
