package bankingEX;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    /**
     * Create a new bank branch
     *
     * @param branchName
     * @return
     */
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            System.out.println("New branch added: " + branchName);
            return true;
        }

        System.out.println(branchName + " already exists");
        return false;
    }

    /**
     * Add customer to a particular branch
     *
     * @param branchName
     * @param firstName
     * @param lastName
     * @param amount
     * @return
     */
    public boolean addCustomer(String branchName, String firstName, String lastName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("New customer: " + lastName + ", " + firstName + " added to the branch " + branchName);
            return branch.addNewCustomer(firstName, lastName, amount);
        }

        return false;
    }

    /**
     * Add transaction for a customer in a particular branch
     *
     * @param branchName
     * @param firstName
     * @param lastName
     * @param amount
     * @return
     */
    public boolean addCustomerTransaction(String branchName, String firstName, String lastName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Adding " + amount + " amount to the customer " + lastName + ", " + firstName + " in the branch: " + branchName);
            return branch.addCustomerTransaction(firstName, lastName, amount);
        }

        return false;
    }

    /**
     * Print a list of branch customers and their transactions if required
     *
     * @param branchName
     * @param showTransactions
     * @return
     */
    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("List of customers for branch: " + branchName);

            ArrayList<Customer> branchCustomers = branch.getBranchCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i + 1) + ". Customer: " + branchCustomer.getLastName() + ", " + branchCustomer.getFirstName());
                if (showTransactions) {
                    System.out.println("TRANSACTIONS #####################");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
                System.out.println(" ");
            }
            return true;
        }

        return false;
    }

    /**
     * Find a specific branch using a name as parameter
     *
     * @param branchName
     * @return
     */
    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);

            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }

        System.out.println("Branch name not found");
        return null;
    }
}
