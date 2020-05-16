package arrayMinValueEX;

import java.util.Arrays;

import static arrayMinValueEX.ArrayManagement.*;

public class Main {

    public static void main(String[] args) {
        int[] array = createArray();

        readIntegers(array);

        findMin(array);

        findMax(array);
    }
}
