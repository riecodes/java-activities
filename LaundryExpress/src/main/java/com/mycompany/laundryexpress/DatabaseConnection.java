package com.mycompany.laundryexpress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/LaundryDB";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection connect() {
        Connection connection = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
            
        } catch (SQLException e) {
            System.out.println("Error: Unable to connect to database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
        return connection;
    }
}
