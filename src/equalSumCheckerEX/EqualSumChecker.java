package equalSumCheckerEX;

public class EqualSumChecker {

    public static boolean hasEqualSum(int numA, int numB, int result) {

        if (numA + numB == result) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    /**
     * Overloading method exercise just for fun
     * @param numA
     * @param numB
     * @return
     */
    public static int sum(int numA, int numB) {

        return numA + numB;
    }

    /**
     * Method overload, just changing the type of parameters received
     * @param numA
     * @param numB
     * @return
     */
    public static int sum(double numA, double numB) {

        return (int) (numA + numB);
    }

    /**
     * Overloading by changing the number of parameters
     * @param numA
     * @param numB
     * @param numC
     * @return
     */
    public static int sum(int numA, int numB, int numC) {
        return numA + numB + numC;
    }
}
