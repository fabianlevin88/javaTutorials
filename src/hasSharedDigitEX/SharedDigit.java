package hasSharedDigitEX;

public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberTwo < 10 || numberOne > 99 || numberTwo > 99) {
            return false;
        }
        int[] digitsOne = new int[2], digitsTwo = new int[2];
        int indexOne = 0;
        int indexTwo = 0;
        int digit = 0;

        while (numberOne > 10) {
            digit = numberOne;
            digitsOne[indexOne] = digit /= 10;
            indexOne++;
            digitsOne[indexOne] = numberOne % 10;
            numberOne /= 10;
        }

        while (numberTwo > 10) {
            digit = numberTwo;
            digitsTwo[indexTwo] = digit /= 10;
            indexTwo++;
            digitsTwo[indexTwo] = numberTwo % 10;
            numberTwo /= 10;
        }

        for (int i : digitsOne) {
            for (int j : digitsTwo) {
                if (i == j) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean hasSharedLastDigit(int numberOne, int numberTwo, int numberThree) {
        int lastDigitOne = 0, lastDigitTwo = 0, lastDigitThree = 0;

        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {
            lastDigitOne = numberOne % 10;
            lastDigitTwo = numberTwo % 10;
            lastDigitThree = numberThree % 10;

            return lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
