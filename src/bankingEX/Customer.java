package bankingEX;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    ArrayList<Double> transactions;

    public Customer(String firstName, String lastName, double initialAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
