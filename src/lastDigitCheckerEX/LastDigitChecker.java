package lastDigitCheckerEX;

public class LastDigitChecker {

    public static final int MIN = 10;
    public static final int MAX = 1000;

    public static boolean hasSameLastDigit(int numA, int numB, int numC) {

        if (!isValid(numA) || !isValid(numB) || !isValid(numC)) {
            return false;
        }

        int lastDigitA = numA % 10;
        int lastDigitB = numB % 10;
        int lastDigitC = numC % 10;

        if (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC) {
            return true;
        }

        return false;
    }

    private static boolean isValid(int number) {
        if ((number >= MIN) && (number <= MAX)) {
            return true;
        }

        return false;
    }
}
