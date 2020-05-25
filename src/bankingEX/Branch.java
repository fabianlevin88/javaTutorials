package bankingEX;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Branch {

    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    /**
     * Add a new customer
     * @param firstName
     * @param lastName
     * @param amount
     * @return
     */
    public boolean addNewCustomer(String firstName, String lastName, double amount) {
        if (findCustomer(firstName,lastName) == null) {
            this.branchCustomers.add(new Customer(firstName, lastName, amount));
            return true;
        }

        System.out.println("Customer already exists");
        return false;
    }

    /**
     * Add a new transaction for a customer
     * @param firstName
     * @param lastName
     * @param amount
     * @return
     */
    public boolean addCustomerTransaction(String firstName, String lastName, double amount) {

        Customer existingCustomer = findCustomer(firstName, lastName);

        if (existingCustomer != null) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            existingCustomer.addTransaction(amount);
            System.out.println(dtf.format(now) + " - Transaction added: " + amount + " to customer " + existingCustomer.getLastName() + ", " + existingCustomer.getFirstName());
            return true;
        }

        return false;
    }

    /**
     * Find a particular customer
     * @param firstName
     * @param lastName
     * @return
     */
    private Customer findCustomer(String firstName, String lastName) {

        for (int i = 0; i < branchCustomers.size(); i++) {

            Customer checkedCustomer = this.branchCustomers.get(i);

            if (checkedCustomer.getFirstName().equals(firstName) && checkedCustomer.getLastName().equals(lastName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
