package com.hexaware.vims.dao;

import com.hexaware.vims.model.User;
import com.hexaware.vims.model.enums.Role;
import com.hexaware.vims.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public void registerUser(User user) {
        String sql = "INSERT INTO users (name, email, password, dob, aadhaar, pan, role) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getDob());
            stmt.setString(5, user.getAadhaar());
            stmt.setString(6, user.getPan());
            stmt.setString(7, user.getRole().name());

            stmt.executeUpdate();
            System.out.println("User registered successfully.");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("X Error in registerUser(): " + e.getMessage());
        }
    }

    @Override
    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        User user = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setDob(rs.getString("dob"));
                user.setAadhaar(rs.getString("aadhaar"));
                user.setPan(rs.getString("pan"));
                user.setRole(Role.valueOf(rs.getString("role")));
                user.setCreatedAt(rs.getString("created_at"));

                System.out.println(" Login successful!");
            } else {
                System.out.println(" Invalid credentials.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("X Error in login(): " + e.getMessage());
        }

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        List<User> users = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setDob(rs.getString("dob"));
                user.setAadhaar(rs.getString("aadhaar"));
                user.setPan(rs.getString("pan"));
                user.setRole(Role.valueOf(rs.getString("role")));
                user.setCreatedAt(rs.getString("created_at"));

                users.add(user);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("❌ Error in getAllUsers(): " + e.getMessage());
        }

        return users;
    }
}
