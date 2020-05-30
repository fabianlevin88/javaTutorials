package linkedListFirstApproachEX;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*
        THIS IS AN EXAMPLE USING ARRAYLIST
         */
        Customer customer = new Customer("Fabian", 123);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(55.76);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        int arrayLength = (int) (Math.random() * 10) + (int) Math.random() * 100;

        for (int i = 0; i < arrayLength; i++) {
            intList.add((int) (Math.random() * 100) + (int) Math.random() * 100);
        }

        printList(intList);
        changeValue(intList, arrayLength);
        printList(intList);

        System.out.println("################ LINKED LIST PART #################");
        /*
        BELOW THIS IS THE FIRST APPROACH TO LINKED LISTS
         */

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Resistencia");
        placesToVisit.add("Buenos Aires");
        placesToVisit.add("Corrientes");
        placesToVisit.add("Cordoba");
        placesToVisit.add("Santa Fe");
        placesToVisit.add("Mendoza");

        printLinkedList(placesToVisit);

        //placesToVisit.add(1, "Tucuman");
        changeValue(placesToVisit, intList.size(), "Tucuman");
        System.out.println("ADDING NEW ELEMENT TO THE LIST");

        printLinkedList(placesToVisit);
    }

    private static void changeValue(ArrayList<Integer> intList, int arrayLength) {

        int index = (int) (Math.random() * 10) + (int) Math.random() * 100;
        int newValue = (int) (Math.random() * 10) + (int) Math.random() * 100;

        if (index < arrayLength) {
            intList.add(index, newValue);
            System.out.println("Inserted value of: " + newValue + " in the index -> " + (intList.size() -1));
        } else {
            System.out.println("As the index was too big for the array list, the last position has been changed");
            System.out.println("Inserted value of: " + newValue);
            intList.add(intList.size(), newValue);
        }
    }

    private static void changeValue(LinkedList<String> linked, int arrayLength, String city) {

        int index = (int) (Math.random() * 10) + (int) Math.random() * 10;

        if (index < arrayLength) {
            linked.add(index, city);
            System.out.println("Inserted city of: " + city + " in the index -> " + index);
        } else {
            System.out.println("As the index was too big for the array list, the last position has been changed");
            System.out.println("Inserted value of: " + city);
            linked.add(linked.size(), city);
        }
    }

    private static void printList(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("position " + i + ": " + intList.get(i));
        }
    }

    private static void printLinkedList(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Now visiting: " + iterator.next());
        }
        System.out.println("###################################################");
    }
}
