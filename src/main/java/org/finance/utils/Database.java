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


    public void createTables() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "user_id INT PRIMARY KEY AUTO_INCREMENT," +
                "userName VARCHAR(60) NOT NULL," +
                "lastName VARCHAR(60) NOT NULL," +
                "password VARCHAR(100) NOT NULL," +
                "email VARCHAR(100))";
        String sql2 = "CREATE TABLE IF NOT EXISTS  expenses (" +
                    "user_id INT," +
                    "dateOfExpenses DATE," +
                    "description VARCHAR(100)," +
                    "FOREIGN KEY (user_id) REFERENCES user(user_id))";
        String sql3 =
                "user_id INT," +
                "user_id INT," +
                "dateOfIncomme DATE," +
                "description VARCHAR(100)," +
                "FOREIGN KEY (user_id) REFERENCES user(user_id))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            stmt.execute(sql2);
            stmt.execute(sql3);

        }
    }
}