import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner scan = new Scanner(System.in);
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
