package Banking;

import javax.swing.*;
import java.awt.*;

class BankAccountJPanel extends JFrame {

    public BankAccountJPanel() {
        setTitle("Employee Create Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel bankAccountPanel = new JPanel(new GridLayout(10, 2)); // Use GridLayout for organization

        JLabel accountIdLabel = new JLabel("Account ID:");
        JTextField accountIdField = new JTextField();

        JLabel balanceLabel = new JLabel("Balance:");
        JTextField balanceField = new JTextField();

        // Add the JLabels and JTextFields to the JPanel
        bankAccountPanel.add(accountIdLabel);
        bankAccountPanel.add(accountIdField);
        bankAccountPanel.add(balanceLabel);
        bankAccountPanel.add(balanceField);

        JPanel customerPanel = new JPanel(new GridLayout(0, 2));

        JLabel customerIdLabel = new JLabel("Customer ID:");
        JTextField customerIdField = new JTextField();

        JLabel customerNameLabel = new JLabel("Customer Name:");
        JTextField customerNameField = new JTextField();

        customerPanel.add(customerIdLabel);
        customerPanel.add(customerIdField);
        customerPanel.add(customerNameLabel);
        customerPanel.add(customerNameField);

        JPanel transactionPanel = new JPanel(new GridLayout(0, 2));

        JLabel transactionIdLabel = new JLabel("Transaction ID:");
        JTextField transactionIdField = new JTextField();

        JLabel transactionAmountLabel = new JLabel("Transaction Amount:");
        JTextField transactionAmountField = new JTextField();

        transactionPanel.add(transactionIdLabel);
        transactionPanel.add(transactionIdField);
        transactionPanel.add(transactionAmountLabel);
        transactionPanel.add(transactionAmountField);

        // Add the panels to the main panel
        panel.add(bankAccountPanel);
        panel.add(customerPanel);
        panel.add(transactionPanel);

        // Add the main panel to the frame
        this.add(panel);
    }
}
