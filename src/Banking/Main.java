/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
//package Banking;
//
//import java.util.Scanner;
//import java.time.LocalDate;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter username: ");
//        String username = scanner.nextLine();
//
//        System.out.println("Enter email: ");
//        String email = scanner.nextLine();
//
//        System.out.println("Enter phone: ");
//        String phone = scanner.nextLine();
//
//        System.out.println("Enter id: ");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // consume newline left-over
//
//        System.out.println("Enter first name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Enter last name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.println("Enter address: ");
//        String address = scanner.nextLine();
//
//        // Create a Customer
//        Customer customer = new Customer(username, email, phone, id, firstName, lastName, address);
//
//        // Create an Account for the Customer
//        Account account = new Account("Customer Name", 1, 0, 0.0, LocalDate.now(), customer);
//
//        System.out.println("Enter deposit amount: ");
//        double deposit = scanner.nextDouble();
//
//        System.out.println("Enter withdrawal amount: ");
//        double withdrawal = scanner.nextDouble();
//
//        System.out.println("Enter transfer amount: ");
//        double transfer = scanner.nextDouble();
//
//        // Create a Transaction
//        Transaction transaction = new Transaction(deposit, withdrawal, transfer);
//
//        // Process the Transaction
//        account.processTransaction(transaction);
//
//        // Display the account balance
//        //account.displayBalance();
//
//        // Display the accounts and priority queue for the customer
//        customer.displayAccounts();
//        customer.displayPriorityQueue();
//
//        scanner.close();
//    }
//}
