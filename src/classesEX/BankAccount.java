package classesEX;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String oustomerName;
    private String email;
    private int phone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(String action, double balance) {

        if (action.equals("deposit")) {
            this.balance += balance;
        } else {
            this.balance -= balance;
        }

    }

    public String getOustomerName() {
        return oustomerName;
    }

    public void setOustomerName(String oustomerName) {
        this.oustomerName = oustomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void depositFunds(double funds) {
        if (funds > 0) {
            setBalance("deposit", funds);
            System.out.println("You made a deposit of: " + funds + " your balance is: " + getBalance());
        }
    }

    public void withdrawFunds(double funds) {

        if (getBalance() > 0 && funds < getBalance()) {
            setBalance("withdraw", funds);
            System.out.println("After withdrawing " + funds + " your account balance is: " + getBalance());
        } else {
            System.out.println("insufficient funds");
        }
    }
}
