package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    final static String url = "jdbc:postgresql://localhost:5432/postgres";
    final static String login = "postgres";
    final static String password = "admin";
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(url, login, password);
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        return con;
    }
}
