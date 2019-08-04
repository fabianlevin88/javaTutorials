package readingIpuntsEX;

import java.util.Scanner;

public class SumInputs {

    static Scanner scanner = new Scanner(System.in);

    static int sum = 0;
    static int total = 0;

    public static int getNumber(int numbers) {

        if (numbers < 0) {
            return -1;
        }

        for (int i = 1; i <= numbers; i++) {
            System.out.println("Enter a number #" + i);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                total = sumNumbers(scanner.nextInt());
            } else {
                System.out.println("not a valid number");
                scanner.nextLine();
            }
        }

        scanner.close();

        return total;
    }

    private static int sumNumbers(int number) {

        return  sum += number;
    }
}
