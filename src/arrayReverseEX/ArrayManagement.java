package arrayReverseEX;

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

    public static void reverseArray(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int index = 0; index < halfLength; index++) {
            int temp = array[index];
            array[index] = array[maxIndex - index];
            array[maxIndex - index] = temp;
        }

        System.out.println("REVERSED ELEMENTS: " + Arrays.toString(array));
    }
}
