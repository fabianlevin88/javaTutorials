package largestPrimeEX;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int count = 1;
        int maxPrime = 0;

        while (count < number) {
            if (number % count == 0) {
                if (isPrime(count)) {
                    maxPrime = count;
                }
            }
            count++;
        }

        return maxPrime;
    }

    private static boolean isPrime(int num) {

        int primeCounter = 0;

        for (int counter = 1; counter < num; counter++) {
            if (num % counter == 0) {
                primeCounter++;
            }
        }

        if (primeCounter == 1) {
            return true;
        }

        return false;
    }
}
