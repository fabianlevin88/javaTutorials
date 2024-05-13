package sumFirstAndLastNumberEX;

public class Sum {

    public int sumFirstAndLastDigit(int number) {
        String numberString = String.valueOf(number);

        return Integer.parseInt(String.valueOf(numberString.charAt(0))) + Integer.parseInt(String.valueOf(numberString.charAt(numberString.length() - 1)));
    }
}
