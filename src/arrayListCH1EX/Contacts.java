package arrayListCH1EX;

import java.util.ArrayList;
import java.util.Arrays;

public class Contacts {

    private String name;
    private String lastName;
    private String phone;
    static ArrayList<Contacts> listOfContacts = new ArrayList<>();

    public Contacts(String name, String lastName, String phone) {
        setName(name);
        setLastName(lastName);
        setPhone(phone);
    }

    public Contacts() {}

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public static void addContact(Contacts contacts) {
        listOfContacts.add(contacts);
    }

    public void getListOfContacts() {
        for (int i = 0; i < listOfContacts.size(); i++) {
            System.out.println((i+1) + ". " + listOfContacts.get(i).getLastName() + ", " + listOfContacts.get(i).getName() + " - " + listOfContacts.get(i).phone);
        }
    }

    public int getListSize() {
        return listOfContacts.size();
    }

    private void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name not provided");
        }
    }

    private void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            System.out.println("Last name not provided");
        }

    }

    private void setPhone(String phone) {
        this.phone = "+549362" + phone;
    }

    public static void modifyContactName(int position, String newName) {
        listOfContacts.get(position-1).setName(newName);
    }

    public static void modifyContactLastName(int position, String newLastName) {
        listOfContacts.get(position-1).setLastName(newLastName);
    }

    public static void modifyContactPhone(int position, String newPhone) {
        listOfContacts.get(position-1).setPhone(newPhone);
    }

    public static void removeContact(int position) {
        System.out.println(listOfContacts.get(position-1).getLastName() + ", " + listOfContacts.get(position-1).getName() + " has been deleted");
        listOfContacts.remove(position-1);
    }

    public static void printContactNameInfo(String searchFirstName) {
        boolean flag = false;
        for (int i = 0; i < listOfContacts.size(); i++) {
            if (searchFirstName.equalsIgnoreCase(listOfContacts.get(i).getName())) {
                System.out.println((i+1) + " - " + listOfContacts.get(i).getName());
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(searchFirstName + " was not found on the list");
        }
    }

    public static void printContactLastNameInfo(String searchLastName) {

        for (int i = 0; i < listOfContacts.size(); i++) {
            if (searchLastName.equalsIgnoreCase(listOfContacts.get(i).getLastName())) {
                System.out.println((i+1) + " - " + listOfContacts.get(i).getLastName());
                break;
            } else {
                System.out.println(searchLastName + " was not found on the list");
            }
        }


    }

    public static void printContactPhoneInfo(String searchPhoneNumber) {
        String formatNumber = "+549362" + searchPhoneNumber;
        for (int i = 0; i < listOfContacts.size(); i++) {
            if (formatNumber.equalsIgnoreCase(listOfContacts.get(i).getPhone())) {
                System.out.println((i+1) + " - " + listOfContacts.get(i).getPhone());
                break;
            } else {
                System.out.println(searchPhoneNumber + " Was not found on the list");
            }
        }
    }
}
