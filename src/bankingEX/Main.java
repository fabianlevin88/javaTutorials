package bankingEX;

public class Main {

    public static void main(String[] args) {

        String branchRcia = "Resistencia";
        String branchCtes = "Corrientes";
        String branchSantaFe = "Santa Fe";

        Bank bank = new Bank("Santander Rio");
        bank.addBranch(branchRcia);
        bank.addCustomer(branchRcia, "Fabian", "Levin", 100);
        bank.addCustomer(branchRcia, "Constanza", "Perez", 865.2);
        bank.addCustomer(branchRcia, "Jorge", "Levin", 71.2);
        bank.addCustomer(branchRcia, "Daniel", "Levin", 26.875);
        bank.addCustomer(branchRcia, "Sebastian", "Levin", 669.24);
        bank.addCustomer(branchRcia, "Patricia", "Martinez", 10000.57);

        bank.addBranch(branchCtes);
        bank.addCustomer(branchCtes, "Sara", "Matusevich", 100);

        bank.addCustomerTransaction(branchRcia, "Fabian", "Levin", 1520);
        bank.addCustomerTransaction(branchRcia, "Fabian", "Levin", -123.50);
        bank.addCustomerTransaction(branchCtes, "Sara", "Matusevich", 13.75);
        bank.addCustomerTransaction(branchCtes, "Sara", "Matusevich", 257.22);
        bank.addCustomerTransaction(branchRcia, "Patricia", "Martinez", 527.14);

        bank.listCustomers(branchRcia, true);
        bank.listCustomers(branchCtes, true);
        bank.listCustomers(branchSantaFe, true);

        bank.addBranch(branchRcia);
    }
}
