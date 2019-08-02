package numberToWordsV2EX;

public class NumberToWords {

    private static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    private static int reverse(int reversedNumber) {
        int reverse = 0;

        while (reversedNumber != 0){

            int lastDigit = reversedNumber %10;
            reverse *= 10;
            reverse += lastDigit;
            reversedNumber /= 10;
        }

        return reverse;
    }

    public static void numberToWords(int number) {

        int reversedNumber = reverse(number);

        int digits = getDigitCount(number);

        if (digits < 0) {
            System.out.println("Invalid Value");
        }

        int lastDigit;

        for (int i = 1; i <= digits; i++) {
            lastDigit = reversedNumber % 10;

            printNumberInWord(lastDigit);

            reversedNumber /= 10;

        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.print("ZERO ");
                break;
            case 1:
                System.out.print("ONE ");
                break;
            case 2:
                System.out.print("TWO ");
                break;
            case 3:
                System.out.print("THREE ");
                break;
            case 4:
                System.out.print("FOUR ");
                break;
            case 5:
                System.out.print("FIVE ");
                break;
            case 6:
                System.out.print("SIX ");
                break;
            case 7:
                System.out.print("SEVEN ");
                break;
            case 8:
                System.out.print("EIGHT ");
                break;
            case 9:
                System.out.print("NINE ");
                break;
            default:
                System.out.print("OTHER ");
        }
    }
}
