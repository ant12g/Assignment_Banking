/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
package Banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.*;
import javax.swing.JOptionPane;

class CustomerDAOConcrete implements CustomerDAO {

    static Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    static String url = CustomerDataConnection.getURL();
    static String username = CustomerDataConnection.getUsername();
    static String pwd = CustomerDataConnection.getPWD();

//    CustomerDAOConcrete() {
//
//        try {
//
//            connection = CustomerDataConnection.getDBConnection();
//
//        } catch (SQLException se) {
//            System.out.println(se.getMessage());
//        }
//
//    }
CustomerDAOConcrete() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = CustomerDataConnection.getDBConnection();
    } catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC Driver not found. Include it in your library path ");
        e.printStackTrace();
    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSC413", "root", "passwords");
    } catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC Driver not found. Include it in your library path ");
        e.printStackTrace();
    } catch (SQLException se) {
        System.out.println(se.getMessage());
    }
}


    // Method to disconnect from the database
    public static void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Method to insert a user into the database
    @Override
    public int insert(Customer emp) throws SQLException {

        int res = -1;
        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        res = pStatement.executeUpdate();
        disconnect();

        return res;
    }

    // Method to retrieve a user from the database by ID
    @Override
    public Customer get(int anID) throws SQLException {

        pStatement = connection.prepareStatement(CustomerDataConnection.getSelect());
        pStatement.setInt(1,anID);
        result = pStatement.executeQuery();

        Customer updatedEmp = null;
        if (result.next()) {
            Customer e = new Customer(result.getInt("id"), result.getString("username"), result.getString("email"), result.getString("phone"));
            updatedEmp = new Customer( result.getInt("id"), result.getString("username"), result.getString("email"), result.getString("phone"));
        }

        return updatedEmp;
    }

    // Method to update a user in the database
    public int update(Customer emp) throws SQLException {

        int result = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getUpdate());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        pStatement.setString(3, emp.getPhone());
        pStatement.setInt(4, emp.getId());
        result = pStatement.executeUpdate();

        return result;
    }

    // Method to delete a user from the database
    @Override
    public int delete(Customer emp) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getDelete());
        pStatement.setInt(1,emp.getId());
        res = pStatement.executeUpdate();

        return res;
    }

    // Method to update a user in the database
    @Override
    public int save(Customer emp) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        pStatement.setInt(3, emp.getId());
        res = pStatement.executeUpdate();

        return res;
    }

}

