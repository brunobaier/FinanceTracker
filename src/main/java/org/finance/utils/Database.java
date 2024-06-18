package org.finance.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class Database {
    public static String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
    public static String username = "myuser";
    public static String password = "mypassword";
    public static String databaseName = "mydatabase";

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(jdbcUrl,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void createDatabaseIfNotExist() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "user_id INT PRIMARY KEY AUTO_INCREMENT," +
                "userName VARCHAR(60) NOT NULL," +
                "lastName VARCHAR(60) NOT NULL," +
                "password VARCHAR(100) NOT NULL," +
                "email VARCHAR(100))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Banco de dados criado com sucesso (se não existia): " + databaseName);
        }
    }
}