package Banking;

import java.util.Scanner;

import java.time.LocalDate;
public class Account implements ComparableInterface {
    private String customerName;
    private int customerID;
    private double balance;
    private double previousBalance;
    LocalDate creationDate;
    private Customer customer;
    private Account account;

    public Account(String customerName, int customerID, double balance, double previousBalance,LocalDate creationDate, Customer customer) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.balance = balance;
        this.previousBalance = previousBalance;
        this.creationDate = creationDate;

        this.customer = customer;
        this.customer.addAccounts(this);
    }
    public void processTransaction (Transaction transaction) {
        this.balance += transaction.getDeposit();
        this.withdraw(transaction.getWithdrawal());
    }
    public void createTransaction(double deposit, double withdrawal,double transfer)
    {
        Transaction transaction = new Transaction(deposit, withdrawal, transfer);
            transaction.execute();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public int compareTo(Object o) {
        Account otherAccount = ( Account) o;
        int dateComparison = this.creationDate.compareTo(otherAccount.getCreationDate());
        if (dateComparison != 0) {
            return dateComparison;
        } else {
            return Double.compare(otherAccount.getBalance(), this.balance);
        }
    }

    public void withdraw(double withdrawal) {
        if (withdrawal <= this.balance) {
            this.balance -= withdrawal;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }
    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
