package com.hexaware.vims.model;

import com.hexaware.vims.model.enums.Role;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String dob;
    private String aadhaar;
    private String pan;
    private Role role;
    private String createdAt;

    public User() {}

    public User(int userId, String name, String email, String password, String dob, String aadhaar,
                String pan, Role role, String createdAt) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.aadhaar = aadhaar;
        this.pan = pan;
        this.role = role;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob='" + dob + '\'' +
                ", aadhaar='" + aadhaar + '\'' +
                ", pan='" + pan + '\'' +
                ", role=" + role +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) { this.userId = userId; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAadhaar() {
        return aadhaar;
    }
    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
