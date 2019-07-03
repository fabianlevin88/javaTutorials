package equalSumCheckerEX;

public class Main {

    public static void main(String[] args) {
        EqualSumChecker sumChecker = new EqualSumChecker();

        sumChecker.hasEqualSum(6,-2,4);

        // Method overloading
        int number = sumChecker.sum(4, 9);

        int numberTwo = sumChecker.sum(2, -7);

        int numberThree = sumChecker.sum(9, -6, 2);

        System.out.println("Calling first sum: " + number + " and second call: " + numberTwo);

        System.out.println("Calling last method with 3 parameters: " + numberThree);
    }
}
