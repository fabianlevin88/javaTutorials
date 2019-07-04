package barkingDogEX;

import static barkingDogEX.BarkingDog.*;

public class Main {

    public static void main(String[] args) {
        // Should return false
        shouldWakeUp(true, 10);
        shouldWakeUp(false, 10);
        System.out.println("*******");

        // Invalid hours. Should return false
        shouldWakeUp(true, -2);
        shouldWakeUp(false, 24);
        System.out.println("*******");

        // Should return true
        shouldWakeUp(true, 5);
        shouldWakeUp(true, 23);
    }
}
