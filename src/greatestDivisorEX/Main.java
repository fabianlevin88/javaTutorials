package greatestDivisorEX;

import static greatestDivisorEX.GreatestCommonDivisor.getGreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        System.out.println("final count: " + getGreatestCommonDivisor(25, 15));
        System.out.println("final count: " + getGreatestCommonDivisor(12, 30));
        System.out.println("final count: " + getGreatestCommonDivisor(9, 18));
        System.out.println("final count: " + getGreatestCommonDivisor(81, 153));
    }
}
