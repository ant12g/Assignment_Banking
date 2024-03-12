/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
package Banking;

import java.time.LocalDate;

public class SavingsAccount extends Account {
    public SavingsAccount(String customerName, int customerID, double balance, double previousBalance, LocalDate creationD,
                          Customer customer)
    {
        super(customerName, customerID, balance, previousBalance, creationD, customer);
    }
}
