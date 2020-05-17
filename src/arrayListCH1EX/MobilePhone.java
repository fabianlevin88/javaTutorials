package arrayListCH1EX;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();

    public static void printMenu() {

        System.out.println("Welcome to your mobile phone menu, what would you like to do?");
        System.out.println("\t 1- Add new contact");
        System.out.println("\t 2- View list of contacts");
        System.out.println("\t 3- Modify a particular contact");
        System.out.println("\t 4- Remove a particular contact");
        System.out.println("\t 5- Search for a contact");
        System.out.println("\t 6- See the menu again");
        System.out.println("\t 7- Quit menu");
    }

    public static void readOptions() {
        int option;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter the desired option: \r");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContactList();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Option entered not supported");
                    printMenu();
                    break;
            }
        }
    }

    private static void addContact() {
        String name;
        String lastName;
        String phoneNumber;

        System.out.println("Please enter the name: ");
        name = scanner.next();

        System.out.println("Please enter the last name: ");
        lastName = scanner.next();

        System.out.println("Please enter the phone number (i.e. +5493624781856): ");
        phoneNumber = scanner.next();

        Contacts contact = new Contacts(name, lastName, phoneNumber);

        contact.addContact(contact);
    }
    private static void viewContactList() {

        if (contacts.getListSize() > 0) {
            contacts.getListOfContacts();
        } else {
            System.out.println("List is empty");
        }

    }
    private static void modifyContact() {
        int position, option;
        String newName, newLastName, newPhoneNumber;

        if (contacts.getListSize() > 0) {
            contacts.getListOfContacts();
            System.out.println("Which contact would you like to modify? \r");
            position = scanner.nextInt();
            if (position <= contacts.getListSize()) {
                System.out.println("What would you like to modify? \r");
                printModifyOptions();
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter the new name: \r");
                        newName = scanner.next();
                        contacts.modifyContactName(position, newName);
                        break;
                    case 2:
                        System.out.println("Enter the new last name: \r");
                        newLastName = scanner.next();
                        contacts.modifyContactLastName(position, newLastName);
                        break;
                    case 3:
                        System.out.println("Enter the new phone number: \r");
                        newPhoneNumber = scanner.next();
                        contacts.modifyContactPhone(position, newPhoneNumber);
                        break;
                    default:
                        System.out.println("option not supported");
                        break;
                }
            } else {
                System.out.println("Item is not present in the list");
            }
        }

    }
    private static void removeContact() {
        int position;

        if (contacts.getListSize() > 0) {
            contacts.getListOfContacts();
            System.out.println("Which contact would you like to delete? \r");
            position = scanner.nextInt();

            if (position <= contacts.getListSize()) {
                contacts.removeContact(position);

            } else {
                System.out.println("list do not have that element");
            }
        } else {
            System.out.println("List is empty. Please add contacts first");
        }

    }

    private static void printModifyOptions() {

        System.out.println("\t 1- First Name");
        System.out.println("\t 2- Last Name");
        System.out.println("\t 3- Phone Number");
    }

    private static void findContact() {
        int option;
        String searchFirstName, searchLastName, searchPhoneNumber;

        if (contacts.getListSize() > 0) {
            System.out.println("What are you looking for? \r");
            System.out.println("\t 1- First Name");
            System.out.println("\t 2- Last Name");
            System.out.println("\t 3- Phone Number");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the name you would like to search: \r");
                    searchFirstName = scanner.next();
                    contacts.printContactNameInfo(searchFirstName);
                    break;
                case 2:
                    System.out.println("Enter the last name you would like to search: \r");
                    searchLastName = scanner.next();
                    contacts.printContactLastNameInfo(searchLastName);
                    break;
                case 3:
                    System.out.println("Enter the phone number you would like to search: \r");
                    searchPhoneNumber = scanner.next();
                    contacts.printContactPhoneInfo(searchPhoneNumber);
                    break;
                default:
                    System.out.println("The option entered is not supported");
                    break;
            }
        } else {
            System.out.println("List is empty");
        }

    }
}
