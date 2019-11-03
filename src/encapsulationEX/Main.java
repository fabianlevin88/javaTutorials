package encapsulationEX;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20, 3, false);

        printer.fillToner(60);
        printer.fillToner(-40);

        printer.printPage(5);
    }

}
