package Banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerDataConnection {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "passwords";

    // JDBC variables for opening and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // SQL queries to be used to persist business objects as needed by the DAO
    private static final String INSERT_SQL = "INSERT INTO Employee (username, email) VALUES (?, ?)";
    private static final String SELECT_SQL_BYID = "SELECT * FROM Employee WHERE id = ?";
    private static final String UPDATE_SQL = "UPDATE Employee SET username = ?, email = ?, phone = ? WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM Employee WHERE id = ?";

    public CustomerDataConnection()  { }

    public static Connection getDBConnection() throws SQLException {

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return connection;
    }

    public static String getInsert() {

        return INSERT_SQL;
    }

    public static String getUpdate() {

        return UPDATE_SQL;
    }

    public static String getSelect() {

        return SELECT_SQL_BYID;
    }

    public static String getDelete() {

        return DELETE_SQL;
    }

    public static String getURL() {

        return URL;
    }

    public static String getUsername() {

        return USERNAME;
    }

    public static String getPWD() {

        return PASSWORD;
    }

    public static void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
