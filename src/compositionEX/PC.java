package compositionEX;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerUpButton();
    }

    public void drawLogo() {
        System.out.println("Drawing logo..");
        monitor.drawPixelAt(1000, 300, "yellow");
    }

    public void startPC() {
        motherboard.BoottingUp();
    }
}
