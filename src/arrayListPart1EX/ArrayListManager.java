package arrayListPart1EX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListManager {

    private static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> createArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();

        return arrayList;
    }

    static int defineListSize() {
        System.out.println("How may items would you like to add to the list?\r");

        int size = scanner.nextInt();

        return size;
    }

    static void addItems(ArrayList<String> arrayList, int numberOfItems) {
        Scanner items = new Scanner(System.in);

        for (int index = 0; index < numberOfItems; index++) {
            System.out.println("What do you want to add to the list?\r");
            arrayList.add(items.nextLine());
        }
    }

    static void printGroceryList(ArrayList<String> arrayList) {

        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println((index + 1) + " - " + arrayList.get(index).toUpperCase());
        }
    }

    static void modifyGroceryList(int position, ArrayList<String> arrayList, String newItem) {

        try {
            arrayList.set(position - 1, newItem);

            System.out.println("New item " + newItem + " added to the " + position + " position");
        } catch (IndexOutOfBoundsException e) {
            arrayList.set(arrayList.size() - 1, newItem);
        }
    }

    static String removeItem(ArrayList<String> arrayList, String searchItem) {
        if (findItem(arrayList, searchItem)) {
            arrayList.remove(itemPosition(arrayList, searchItem));
            return "Element " + searchItem + " removed from the list";
        }

        return "Element not found in the list";
    }

    private static boolean findItem(ArrayList<String> arrayList, String searchItem) {

        return arrayList.contains(searchItem);
    }

    private static int itemPosition(ArrayList<String> arrayList, String searchItem) {

        return arrayList.indexOf(searchItem);
    }
}
