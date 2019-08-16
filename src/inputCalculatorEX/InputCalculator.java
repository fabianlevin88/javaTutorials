package inputCalculatorEX;

public class InputCalculator {
    static int sum = 0;
    static int average = 0;

    public static void sumAndAverage(int value) {

        sum += value;
        average = sum / sum;

        System.out.println("sum: " + sum + " average: " + average);

    }

}
