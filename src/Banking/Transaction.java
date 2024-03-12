package Banking;

import java.util.Scanner;

public class Transaction {

    private Account account;
    private double deposit;
    private double withdrawal;

    private double transfer;


    public Transaction(double deposit, double withdrawal, double transfer) {
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.transfer = transfer;
    }
    public Transaction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit amount: ");
        this.deposit = scanner.nextDouble();

        System.out.println("Enter withdrawal amount: ");
        this.withdrawal = scanner.nextDouble();

        System.out.println("Enter transfer amount: ");
        this.transfer = scanner.nextDouble();
    }


    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double getTransfer() {
        return transfer;
    }

    public void setTransfer(double withdrawal){
        this.transfer = transfer;
    }

    public void execute(){
        if (deposit > 0){
            account.deposit(deposit);
        }
        if (withdrawal > 0) {
            account.withdraw(withdrawal);
        }
        if (transfer > 0){
            //transfer.transfered(transfer);
        }
    }
}
