package compositionEX;

public class Main {

    public static void main(String[] args) {
        Case theCase = new Case("234FSD-12D", "ASUS", new Dimensions(300, 200, 100));
        Motherboard motherboard = new Motherboard("H1ME-D", "ASUS", 4, 2);
        Monitor monitor = new Monitor("BEAST-23.1", "DELL", 27, new Resolution(2540, 1440));
        PC pc = new PC(theCase, monitor, motherboard);

        pc.getTheCase().pressPowerUpButton();

        pc.getMotherboard().BoottingUp();

        pc.getMonitor().drawPixelAt(30, 500, "red");
    }

}
