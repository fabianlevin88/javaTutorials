package readingIpuntsEX;

import java.util.Scanner;

import static readingIpuntsEX.SumInputs.getNumber;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total numbers to be sumorized");

        boolean isAValidNumber = scanner.hasNextInt();

        if (isAValidNumber) {
            int numbers = scanner.nextInt();

            if (numbers < 0) {
                System.out.println("Invalid number entered");
            } else {
                System.out.println("Total sum is: " + getNumber(numbers));
            }

        } else {
            System.out.println("Invalid number");
        }



        scanner.close();
    }

}
