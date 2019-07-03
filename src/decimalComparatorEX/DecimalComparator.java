package decimalComparatorEX;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB) {

        if ((int) (numberA*1000) == (int) (numberB*1000))  {
            return true;
        }
        return false;
    }
}
