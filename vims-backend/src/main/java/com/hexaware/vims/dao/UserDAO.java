package com.hexaware.vims.dao;

import com.hexaware.vims.model.User;
import java.util.List;

public interface UserDAO {
    void registerUser(User user);
    User login(String email, String password);
    List<User> getAllUsers();
}
