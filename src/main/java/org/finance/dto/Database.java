package org.finance.dto;
import java.sql.*;
import java.sql.Connection;

public class Database {
    private Connection connection;

    public void connect() throws SQLException {
        // Checa a conexão
        if (connection == null)  {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "your_username";
            String password = "your_password";
            connection = DriverManager.getConnection(url, user, password);
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
        }
}
