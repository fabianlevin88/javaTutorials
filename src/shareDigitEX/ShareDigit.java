package shareDigitEX;

public class ShareDigit {

    public static boolean hasSharedDigit(int numA, int numB) {

        if (numA < 10 || numA > 99 || numB < 10 || numB > 99) {
            return false;
        }

        int firstDigitA = numA / 10;
        int lastDigitA = numA % 10;

        int firstDigitB = numB / 10;
        int lastDigitB = numB % 10;

        if (firstDigitA == firstDigitB || firstDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitA == lastDigitB) {
            return true;
        }

        return false;
    }
}
