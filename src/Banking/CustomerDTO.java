/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
package Banking;

import java.sql.SQLException;

public class CustomerDTO {

        private int id;
        private String username;
        private String email;
        private String phone;

        static CustomerDAOConcrete ed = new CustomerDAOConcrete();

        public CustomerDTO() {
            // Default constructor

        }

        public CustomerDTO(int empID, String username, String email) {
            this.username = username;
            this.email = email;
            id = empID;
        }

        public CustomerDTO(String username, String email, String ph) {
            this.username = username;
            this.email = email;
            this.phone = ph;
        }

        // Getter and Setter methods
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String ph) {
            this.phone = ph;
        }

        public int getID() {

            return id;
        }

        public void setID(int anID) {
            this.id = anID;
        }

        public static Customer employeeByID(int anId) {

            Customer anEmployee = null;

            try {
                anEmployee = ed.get(anId);
            } catch(SQLException se) {
                System.out.println(se.getMessage());
            }
            if(anEmployee != null) System.out.println(anEmployee.toString());

            System.out.println("\nFetched Customer with ID: " + anId + " Employee Details:\n" + anEmployee.toString());
            return anEmployee;

        }

        public static int performUpdate(Customer anEmployee) {

            int updateResult = -1;

            try {
                updateResult = ed.update(anEmployee);
            } catch(SQLException se) {
                System.out.println(se.getMessage());
            }

            if(updateResult != -1) System.out.println("\nUpdate Successful");
            System.out.println("Employee Details:\n" + anEmployee.toString());
            return updateResult;
        }
}
