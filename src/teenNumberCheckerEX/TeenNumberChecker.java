package teenNumberCheckerEX;

public class TeenNumberChecker {

    public static boolean hasTeen(int numA, int numB, int numC) {
        if (numA >= 13 && numA <= 19 || numB >= 13  && numB <= 19 || numC >= 13  && numC <= 19 ) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
