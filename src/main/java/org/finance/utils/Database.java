package org.finance.utils;

import java.sql.Connection;
import org.finance.model.User;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class Database {
    public static String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
    public static String username = "myuser";
    public static String password = "mypassword";
    public static String databaseName = "mydatabase";

    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }


    public void insertDatabase(User user) throws SQLException{
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
    public void modifyPassword(User user) throws SQLException{
        String sql = "UPDATE users SET password = ? WHERE user_name = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUserPassword());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.executeUpdate();
        }
    public void modifyEmail(User user) throws SQLException {
        String sql = "UPDATE users SET email = ? WHERE user_name = ?";
        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.executeUpdate(); // Executar a atualização
        }   
    }

   
}