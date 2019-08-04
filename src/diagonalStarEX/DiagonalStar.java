package diagonalStarEX;

public class DiagonalStar {

    private static final String INVALID_STRING = "Invalid Value";

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println(INVALID_STRING);
        } else {

            for (int rows = 1; rows <= number; rows++) {

                for (int col = 1; col <= number; col++) {

                    boolean condition = col == number - rows + 1;

                    if (col == 1 || col == number || col == rows || condition || rows == number || rows == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println(" ");
            }
        }
    }
}
