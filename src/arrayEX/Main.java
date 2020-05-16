package arrayEX;

import static arrayEX.ArrayManagement.*;

public class Main {

    public static void main(String[] args) {
        int anInt = 5;

        int[] myArray = createArray(anInt);

        System.out.println("############## Descending order ############## ");
        printArrayValues(orderArrayDesc(myArray));
        System.out.println("############## Ascending order ############## ");
        printArrayValues(orderArrayAsc(myArray));
    }
}