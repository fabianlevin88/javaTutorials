package shareDigitEX;

import static shareDigitEX.ShareDigit.hasSharedDigit;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(9, 9));
        System.out.println(hasSharedDigit(12, 13));
    }
}
