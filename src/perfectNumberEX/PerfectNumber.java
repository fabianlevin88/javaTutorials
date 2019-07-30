package perfectNumberEX;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        int sum = 0;

        if (number < 1) {
            return false;
        }

        for (int divisor = 1; divisor < number; divisor++) {

            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        if (sum == number) {
            return true;
        }
        return false;
    }
}
