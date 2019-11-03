package encapsulationEX;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;

    }

    public void fillToner(int toner) {
        if (toner < 0) {
            System.out.println("Amout of toner to be filled cannot be negative");
        } else if (this.tonerLevel + toner <= 100) {
            setTonerLevel(toner);
        }
    }

    public void printPage(int pages) {
        if (pages < 0) {
            System.out.println("Error when entering number of pages");
        } else {
            setPagesPrinted(pages);
        }
    }

    private void setTonerLevel(int toner) {
        this.tonerLevel += toner;
        System.out.println("Toner level is: " + this.tonerLevel);
    }

    private void setPagesPrinted(int pages) {
        this.pagesPrinted += pages;
        System.out.println("Number of pages printed: " + this.pagesPrinted);
    }

}
