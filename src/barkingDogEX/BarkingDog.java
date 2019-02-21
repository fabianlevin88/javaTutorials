package barkingDogEX;

public class BarkingDog {

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(false);
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
