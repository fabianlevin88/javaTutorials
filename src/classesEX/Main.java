package classesEX;

public class Main {

    public static void main(String[] args) {

        BankAccount emptyAccount = new BankAccount();

        // Displaying the empty account's data
        emptyAccount.getAccountNumber();
        emptyAccount.getCustomerName();
        emptyAccount.getBalance();
        emptyAccount.getEmail();
        emptyAccount.getPhone();

        BankAccount account = new BankAccount("ASD123", 1000, "Fabian Andres Levin", "fabianlevin60@gmail.com", "+543624781856");

        // Displaying the account's data
        account.getAccountNumber();
        account.getCustomerName();
        account.getBalance();
        account.getEmail();
        account.getPhone();

        account.depositFunds(200);

        account.depositFunds(250);

        account.withdrawFunds(10);
    }
}
