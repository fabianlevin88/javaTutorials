package equalSumCheckerEX;

import static equalSumCheckerEX.EqualSumChecker.*;

public class Main {

    public static void main(String[] args) {

        hasEqualSum(6,-2,4);

        // Method overloading
        int number = sum(4, 9);

        int numberTwo = sum(2, -7);

        int numberThree = sum(9, -6, 2);

        System.out.println("Calling first sum: " + number + " and second call: " + numberTwo);

        System.out.println("Calling last method with 3 parameters: " + numberThree);
    }
}
