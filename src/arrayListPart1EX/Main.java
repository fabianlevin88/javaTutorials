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

        removeItem(list, 1);

        printGroceryList(list);

        if (findItem(list, item)) {
            System.out.println(item.toUpperCase() + " located at position: " + itemPosition(list, item));
        } else {
            System.out.println(item.toUpperCase() + " not found in the list");
        }


    }
}
