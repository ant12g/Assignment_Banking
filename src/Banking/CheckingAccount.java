package Banking;

import java.time.LocalDate;

public class CheckingAccount extends Account {

    public CheckingAccount (String customerName, int customerID, double balance, double previousBalance, LocalDate creationDate, Customer customer)
    {
        super(customerName, customerID, balance,
                previousBalance, creationDate, customer);
    }
}
