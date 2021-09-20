package jm.task.core.jdbc.util;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/UsersTable?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Соединение не установлено");
            e.printStackTrace();
        }
        return connection;
    }
}

