package classesEX;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.depositFunds(200);

        account.depositFunds(250);

        account.withdrawFunds(10);
    }
}
