package arrayListPart1EX;

import java.util.ArrayList;
import java.util.Arrays;

import static arrayListPart1EX.ArrayListManager.*;

public class Main {

    public static void main(String[] args) {

        String item = "eggs";
        ArrayList<String> list = createArrayList();

        int listSize = defineListSize();

        addItems(list, listSize);

        printGroceryList(list);

        modifyGroceryList(1, list, "dulce de leche");

        printGroceryList(list);

        System.out.println(removeItem(list, "eggs"));

        printGroceryList(list);
    }
}
