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
}
