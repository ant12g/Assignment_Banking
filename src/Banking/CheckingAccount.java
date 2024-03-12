/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
package Banking;

import java.time.LocalDate;

public class CheckingAccount extends Account {

    public CheckingAccount (String customerName, int customerID, double balance, double previousBalance, LocalDate creationDate, Customer customer)
    {
        super(customerName, customerID, balance,
                previousBalance, creationDate, customer);
    }
}
