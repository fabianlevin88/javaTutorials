package equalityPrinterEX;

public class IntEqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";
    private static final int MIN_VALUE = 0;

    public static void printEqual(int a, int b, int c) {
        if (a < MIN_VALUE || b < MIN_VALUE || c < MIN_VALUE) {
            System.out.println(INVALID_VALUE);
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
