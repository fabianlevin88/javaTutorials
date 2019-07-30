package daysInMonthEX;

import static leapYearEX.LeapYear.*;

public class DaysInMonth {

    public static final int MIN_YEAR = 1;
    public static final int MAX_YEAR = 9999;
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;

    // MONTHS
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int MAY = 5;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int OCTOBER = 10;
    public static final int DECEMBER = 12;

    public static int getDaysInMonth(int month, int year) {
        if (year < MIN_YEAR || year > MAX_YEAR || month < MIN_MONTH || month > MAX_MONTH) {
            return -1;
        }
        switch (month) {
            case JANUARY: case MARCH: case MAY: case JULY: case AUGUST: case OCTOBER: case DECEMBER:
                return 31;
            case FEBRUARY:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }
}
