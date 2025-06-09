package com.hexaware.vims.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/insurance_db";
    private static final String USER = "root";      
    private static final String PASSWORD = "root"; 
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("X Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
