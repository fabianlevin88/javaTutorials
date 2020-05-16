package arrayEX;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManagement {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] createArray(int anInt) {
        int[] array = new int[anInt];

        System.out.println("Enter " + anInt + " number of elements to fill the array\r");

        for (int i = 0; i < anInt; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] orderArrayDesc(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int index = 0; index < sortedArray.length - 1; index++) {
                if (sortedArray[index] < sortedArray[index+1]) {
                    temp = sortedArray[index];
                    sortedArray[index] = sortedArray[index+1];
                    sortedArray[index+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static int[] orderArrayAsc(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int index = 0; index < sortedArray.length - 1; index++) {
                if (sortedArray[index] > sortedArray[index+1]) {
                    temp = sortedArray[index];
                    sortedArray[index] = sortedArray[index+1];
                    sortedArray[index+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("At position " + i + ", the value is: " + array[i]);
        }
    }
}