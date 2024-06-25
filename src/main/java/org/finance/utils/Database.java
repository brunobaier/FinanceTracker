package org.finance.utils;

import java.sql.*;

import org.finance.model.User;
import org.finance.model.Income;
import org.jetbrains.annotations.NotNull;

public class Database {
    public static String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
    public static String username = "myuser";
    public static String password = "mypassword";
    public static String databaseName = "mydatabase";

    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }


    public void insertDatabase(@NotNull User user) throws SQLException{
        String sql = "INSERT INTO users (user_name, last_name, password, salary_range, email) VALUES (?,?,?,?,?)";
       try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setDouble(4, user.getSalaryRange());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.executeUpdate();
        }

    }
    public void modifyPassword(@NotNull User user) throws SQLException{
        String sql = "UPDATE users SET password = ? WHERE user_name = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUserPassword());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.executeUpdate();
        }
    }
        
    public void modifyUserEmail(@NotNull User user) throws SQLException{
        String sql = "UPDATE users SET email = ? WHERE user_name = ?";
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.executeUpdate(); 
        }   
    }

   public void modifySalaryRange(@NotNull User user) throws SQLException {
       String sql = "UPDATE users SET salary_range = ? WHERE user_name = ?";
       try (Connection connection = getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
           preparedStatement.setDouble(1, user.getSalaryRange());
           preparedStatement.setString(2, user.getUserName());
           preparedStatement.executeUpdate(); 
        }   
    }
   public void removeUser(@NotNull User user) throws SQLException {
       String sql = "DELETE FROM users WHERE name = ?";
       try (Connection connection = getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
           preparedStatement.setString(1,user.getUserName());
           preparedStatement.executeUpdate();
       }
   }
    public int getId(@org.jetbrains.annotations.NotNull User user) throws SQLException {
        String sql = "SELECT user_id FROM users WHERE user_name = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUserName());
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("user_id");
                } else {
                    throw new SQLException("User not found");
                }
            }
        }
    }
}