package barkingDogEX;

public class BarkingDog {

    public static final int NOT_MIN_HOUR = 0;
    public static final int NOT_MAX_HOUR = 23;
    public static final int MIN_HOUR = 8;
    public static final int MAX_HOUR = 22;

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < NOT_MIN_HOUR || hourOfDay > NOT_MAX_HOUR) {
            System.out.println(false);
        } else if (barking && (hourOfDay < MIN_HOUR || hourOfDay > MAX_HOUR)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
