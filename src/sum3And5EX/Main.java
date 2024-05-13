package sum3And5EX;

import java.util.Scanner;

public class Main {

    private static Integer range;

    public static void main(String[] args) {
        Sum3And5EX sum3And5EX = new Sum3And5EX();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number ");

            if (scanner.hasNextInt()) {
                range = scanner.nextInt();
            } else {
                System.out.println("Invalid value, please enter a valid Integer value");
                scanner.next();
            }
        } while (range <= 0);

        System.out.println("The total sum of numbers that are divisible by 3 and 5 between 0 and " + range + " is " + sum3And5EX.getSum3And5(range));
        scanner.close();
    }
}
