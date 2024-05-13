package hasSharedDigitEX;

import static hasSharedDigitEX.SharedDigit.hasSharedDigit;
import static hasSharedDigitEX.SharedDigit.hasSharedLastDigit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Has shared digit (Any digit)");
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

        System.out.println("----------");

        System.out.println("Has shared digit (Last digit)");
        System.out.println(hasSharedLastDigit(41, 22, 71));
        System.out.println(hasSharedLastDigit(23, 32, 42));
        System.out.println(hasSharedLastDigit(9, 99, 999));
        System.out.println(hasSharedLastDigit(1, 1, 2));
        System.out.println(hasSharedLastDigit(62, 882, 772));
    }
}
