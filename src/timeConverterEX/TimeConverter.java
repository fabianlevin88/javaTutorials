package timeConverterEX;

public class TimeConverter {


    private static final String INVALID_VALUE = "Invalid Value";

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }

        long hours = minutes / 60;

        long min = minutes % 60;

        String message = hours +"h" + " " + min + "m" + " " + seconds + "s";

        return message;
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE;
        }

        long minutes = seconds / 60;

        long sec = seconds % 60;

        return getDurationString(minutes, sec);
    }
}
