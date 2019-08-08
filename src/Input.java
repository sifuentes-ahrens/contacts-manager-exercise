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

    public void searchContacts() {
        // search by name
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

    public void showAddContacts() {
        Scanner scan = new Scanner(System.in);
        Input stuff = new Input();
        Path contactsPath = Paths.get("data", "contacts.txt");
        do {
            System.out.println("Enter your name: ");
            String name = scan.nextLine();
            String[] fullName = name.split(" ");
            System.out.println("Enter your Phone Number: ");
            String num = scan.nextLine();
            try {
                stuff.addContact(fullName[0], fullName[1], num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("error found! continuing...");
                continue;
            }
                System.out.println("User Added! Continuing...");

        } while (stuff.yesNo());
    }

    public boolean yesNo() {
        System.out.println("continue? [y/n]");
        String answer = scan.nextLine().toLowerCase();
        return (answer.equalsIgnoreCase("y") || answer.contains("yes"));
    }

    public void addContact(String first, String last, String num) {
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
}
