package decimalComparatorEX;

public class DecimalComparator {

    public static final int MULTIPLIER = 1000;

    public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB) {

        if ((int) (numberA * MULTIPLIER) == (int) (numberB * MULTIPLIER))  {
            return true;
        }
        return false;
    }
}
