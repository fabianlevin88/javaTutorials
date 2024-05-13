package plaindromeNumbersEX;

public class PalindromeNumber {

    public boolean isPalindrome(int number) {

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}
