package Banking;

import java.sql.Connection;
import java.sql.SQLException;
import org.modelmapper.ModelMapper;

public class DTOANDDAO {

    /**
     * @param args the command line arguments
     */

    static Connection conn;
    private final static CustomerDAOConcrete ed = new CustomerDAOConcrete();
    static String sampleUsername = "George Washinton";
    static String sampleEmail = "gwashington@sfsu.edu";
    static String samplePhone = "212-555-1212";


    public static void main(String[] args) {

        Customer emp;
        int updateID = 2;
        int fetchID = 1;

        try {
            conn = CustomerDataConnection.getDBConnection();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

        //Fetch an employee with the given ID
        emp = performFetch(fetchID);

        //Create an emplyee to update
        emp = new Customer(updateID, sampleUsername, sampleEmail, samplePhone);

        performUpdate(emp);

        //disconnect db conneciton
        try {
            CustomerDataConnection.disconnect();
        } catch(SQLException se) {
            System.out.println("Exception trying to close connection. Message: \n" + se.getMessage());
        }

        testModelMapper();

    }

    private static Customer performFetch(int empID) {

        return CustomerDTO.employeeByID(empID);

    }

    private static int performUpdate(Customer anEmployee) {

        return CustomerDTO.performUpdate(anEmployee);

    }

    private static void testModelMapper() {

        //create model mapper
        ModelMapper modelMapper = new ModelMapper();

        //Create Data Transfer Object based on Business Object
        CustomerDTO customerDTO = new CustomerDTO(sampleUsername, sampleEmail, samplePhone);

        //Create Business Object from the DTO Objetc
        Customer anCustomer = modelMapper.map(customerDTO, Customer.class);

        System.out.println("\nSuccessfully mapped and unmapped employee with ID: " + anCustomer.getId() + " with employee Details:\n" + anCustomer.toString());
    }

}

