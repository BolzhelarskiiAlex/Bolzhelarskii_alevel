package ua.bolzhelarskii.hw23.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository {
    private static final String URL = "jdbc:mariadb://localhost:3306/alevel";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    protected static Connection connection;
    protected static final List<String> factoryIds = new ArrayList<>();
    protected static final List<String> deviceIds = new ArrayList<>();

    public static List<String> getDeviceIds() {
        return deviceIds;
    }

    public static List<String> getFactoryIds() {
        return factoryIds;
    }

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}