package palindromeNumberEX;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int num = number;
        int reverse = 0;

        while (number != 0){

            int lastDigit = number %10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if (reverse == num) {
            return true;
        }
        return false;
    }
}
