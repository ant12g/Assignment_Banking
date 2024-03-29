/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
package Banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String username;
    private String email;
    private String phone;
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    private List<Account> accounts;
    private LinkedList<Account> accountPriorityQueue;


    public Customer(String username, String email, String phone,
                    int id, String firstName, String lastName, String address)
    {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.accounts = new ArrayList<>();

        this.accountPriorityQueue = new LinkedList<>();
    }

    public Customer(int id, String username, String email, String phone) {

    }


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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayAccounts() {
        for (Account account : this.accounts) {
            System.out.println("Account ID: " + account.getCustomerID());
           // account.displayBalance();
        }
    }

    public void addAccounts(Account account) {
        this.accounts.add(account);
        this.accountPriorityQueue.add(account);
    }

    public LinkedList<Account> getAccountPriorityQueue(){
        return this.accountPriorityQueue;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void displayPriorityQueue() {
        for (Account account : this.accounts) {
           // System.out.println("Account ID: " + account.getCustomerID());
            account.displayBalance();
        }
    }

}
