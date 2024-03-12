package Banking;

import java.time.LocalDate;

public class SavingsAccount extends Account {
    public SavingsAccount(String customerName, int customerID, double balance, double previousBalance, LocalDate creationD,
                          Customer customer)
    {
        super(customerName, customerID, balance, previousBalance, creationD, customer);
    }
}
