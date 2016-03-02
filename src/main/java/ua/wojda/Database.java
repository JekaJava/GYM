package ua.wojda;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by wojda on 02.03.2016.
 */
public class Database {
    private final String URL = "jdbc:mysql://localhost:3306/GYM";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private Connection connection;
    public void connectToDatabase() throws Exception {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connect to database successfully.");
        } catch (SQLException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public void databaseIsClosed() throws SQLException {
        connection.close();
        if ( connection.isClosed()) {
            System.out.println("Connection to database closed.");
        }
    }

    public static Database newDatabase() {
        return new Database();
    }
}
