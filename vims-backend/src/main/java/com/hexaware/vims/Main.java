package com.hexaware.vims;

import com.hexaware.vims.model.User;
import com.hexaware.vims.model.enums.Role;
import com.hexaware.vims.dao.UserDAO;
import com.hexaware.vims.dao.UserDAOImpl;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();

        User user = new User();
        user.setName("Anish Jarag");
        user.setEmail("anishjarag16@gmail.com");
        user.setPassword("test123");
        user.setDob("2003-10-18");
        user.setAadhaar("123412341234");
        user.setPan("ABCDE1234F");
        user.setRole(Role.USER);

        userDAO.registerUser(user);
        userDAO.login("anishjarag16@gmail.com", "test123");
    }
}
