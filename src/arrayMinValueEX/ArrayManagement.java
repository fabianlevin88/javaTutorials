package arrayMinValueEX;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManagement {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] createArray() {
        System.out.println("How many elements will the array have?\r");

        int[] array = new int[scanner.nextInt()];

        return array;
    }

    public static void readIntegers(int[] array) {

        System.out.println("Enter the numbers for the array");

        for(int i = 0; i < array.length; i++) {
            System.out.println("position " + (int) (i + 1) + " of: " + array.length + "\r");
            array[i] = scanner.nextInt();
        }

        System.out.println("ARRAY ELEMENTS ARE: " + Arrays.toString(array));
    }

    public static int findMin(int[] array) {

        int minValue = Integer.MAX_VALUE;

        for (int index = 0; index < array.length; index++) {
            int value = array[index];

            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.println("MIN VALUE IS: " + minValue);

        return minValue;
    }

    public static int findMax(int[] array) {

        int maxValue = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            int value = array[index];

            if (value > maxValue) {
                maxValue = value;
            }
        }

        System.out.println("MAX VALUE IS: " + maxValue);

        return maxValue;
    }
}
