package factorPrinterEX;

public class FactorPrinter {

    private static final String INVALID_VALUE = "Invalid value";

    public static void printFactors(int number) {

        if (number < 0) {
            System.out.println(INVALID_VALUE);
        }

       for (int divisor = 1; divisor <= number; divisor++) {

           if (number % divisor == 0) {
               System.out.println(divisor);
           }
       }
    }
}
