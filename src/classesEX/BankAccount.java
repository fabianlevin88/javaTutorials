package classesEX;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    /**
     * This is a custom, no parameters class constructor
     */
    public BankAccount() {
        this("AAA000", 0, "John Doe", "no-email@no-email.com", "000111222333");
        System.out.println("EMPTY account created");
    }

    /**
     * Custom class constructor
     * @param accountNumber
     * @param balance
     * @param customer
     * @param email
     * @param phone
     */
    public BankAccount(String accountNumber, double balance, String customer, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customer;
        this.email = email;
        this.phone = phone;
        System.out.println("account created");
    }

    public String getAccountNumber() {
        System.out.println("Account: " +accountNumber);
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public void setBalance(String action, double balance) {

        if (action.equals("deposit")) {
            this.balance += balance;
        } else {
            this.balance -= balance;
        }

    }

    public String getCustomerName() {
        System.out.println("Customer: " + customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        System.out.println("Phone number: " + phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * deposit funds to the account
     * @param funds
     */
    public void depositFunds(double funds) {
        if (funds > 0) {
            setBalance("deposit", funds);
            System.out.println("You made a deposit of: " + funds + " your balance is: " + balance);
        }
    }

    /**
     * withdraw funds from the account
     * @param funds
     */
    public void withdrawFunds(double funds) {

        if (balance > 0 && funds < balance) {
            setBalance("withdraw", funds);
            System.out.println("After withdrawing " + funds + " your account balance is: " + balance);
        } else {
            System.out.println("insufficient funds");
        }
    }
}
