package barkingDogEX;

public class Main {

    public static void main(String[] args) {
        // Should return false
        BarkingDog.shouldWakeUp(true, 10);
        BarkingDog.shouldWakeUp(false, 10);
        System.out.println("*******");

        // Invalid hours. Should return false
        BarkingDog.shouldWakeUp(true, -2);
        BarkingDog.shouldWakeUp(false, 24);
        System.out.println("*******");

        // Should return true
        BarkingDog.shouldWakeUp(true, 5);
        BarkingDog.shouldWakeUp(true, 23);
    }
}
