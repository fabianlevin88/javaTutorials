package inputCalculatorEX;

import static inputCalculatorEX.InputCalculator.sumAndAverage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number os elements: ");

        int sum = 0;
        int average = 0;

        if (scanner.hasNextInt()) {

            int value = scanner.nextInt();

            for (int i = 1; i <= value; i++) {
                System.out.println("Enter the number #" + i);
                sum += scanner.nextInt();
                average = sum / i;
            }

            System.out.println("sum: " + sum + " average: " + average);
        }

    }

}
