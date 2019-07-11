package minutesToYearsEX;

public class MinutesToYearsDaysCalculator {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long years = ((minutes / 60) / 24) / 365;

            long days = ((minutes / 60) / 24) % 365;

            System.out.println(minutes + " min = " + years + " years and " + days + " days");
        }
    }
}
