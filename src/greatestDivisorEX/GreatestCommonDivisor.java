package greatestDivisorEX;

public class GreatestCommonDivisor {

    public static final int MIN_VALUE = 10;

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < MIN_VALUE || second < MIN_VALUE) {
            return -1;
        }

        int count = 1;
        int divisor = 1;

        while (divisor <= first && divisor <= second) {
            int divisorA = first % divisor;
            int divisorB = second % divisor;

            if (divisorA == 0 && divisorB == 0) {
                count = divisor;
            }
            divisor++;
        }

        return count;
    }
}
