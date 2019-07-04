package timeConverterEX;

public class TimeConverter {

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        long hours = minutes / 60;

        long min = minutes % 60;

        String message = hours +"h" + " " + min + "m" + " " + seconds + "s";

        return message;
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;

        long sec = seconds % 60;

        return getDurationString(minutes, sec);
    }
}
