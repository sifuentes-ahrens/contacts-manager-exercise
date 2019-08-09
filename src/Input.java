import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner scan = new Scanner(System.in);
    public void viewContact() {
        // #1 view contact list
        do {
            System.out.println("Showing contacts... \n");
            try {
                List<String> contactList;
                Path contactsPath = Paths.get("data", "contacts.txt");
                contactList = Files.readAllLines(contactsPath);
                System.out.println("Name        |  Phone Number  |\n--------------------------------");
                for (String contact : contactList) {
                    System.out.println(contact);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (yesNo());
    }
    public void searchContacts() {
        // #3 search by name
        System.out.println("Enter name to search: ");
        String search = scan.nextLine().toLowerCase();
        try {
            List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
            for (String line : lines) {
                if (line.toLowerCase().contains(search)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Another Error! continuing...");
        }
    }
    public void addContactsAction() {
        //#2 add contacts
        Scanner scan = new Scanner(System.in);
        Input stuff = new Input();
        do {
            System.out.println("Enter your first and last name: ");
            String name = scan.nextLine();
            String[] fullName = name.split(" ");
            System.out.println("Enter your Phone Number: ");
            String num = scan.nextLine();
            try {
                stuff.addContact(fullName[0], fullName[1], num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect format. Try again.");
                continue;
            }
            System.out.println("adding \"" + name + " " + num + "\" to database...");
            System.out.println("User Added! Continuing...");
            break;
        } while (true);
    }
    public boolean yesNo() {
        System.out.println("\nPress \"n\" to continue...");
        String answer = scan.nextLine().toLowerCase();
        return (answer.equalsIgnoreCase("y") || answer.contains("yes"));
    }
    public void addContact(String first, String last, String num) {
        //Add contacts
        Path dataFile = Paths.get("data", "contacts.txt");
        String name = first + " " + last;
        String info = name + " | " + num + " |";
        List<String> contacts = Arrays.asList(info);
        try {
            Files.write(dataFile, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
    public void deleteContacts() {
        // #4 Delete by name
        System.out.println("Enter name to delete: ");
        String search = scan.nextLine().toLowerCase();
        boolean i = true;
        do {
            try {
                List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
                List<String> newList = new ArrayList<>();
                for (String line : lines) {
                    if (!line.toLowerCase().contains(search)) {
                        newList.add(line);
                    }
                    Files.write(Paths.get("data", "contacts.txt"), newList);
                }
                i = false;
                System.out.println("Contact deleted. Returning to menu...");
            } catch (IOException e) {
                System.out.println("Another Error! continuing...");
            }
        } while (i);
    }
}
