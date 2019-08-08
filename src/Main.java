import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void ShowAddContacts() {
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
            try {
                List<String> contactsList = Files.readAllLines(contactsPath);
                for (String contact : contactsList) {
                    System.out.println(contact);
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        } while (stuff.yesNo());
    }
}
