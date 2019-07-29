package evenDigitSumEX;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {

            int newNumber = number - ((number / 10) * 10);

            if (newNumber % 2 == 0) {
                sum += newNumber;
            }

            number /= 10;
        }

        return sum;
    }
}
