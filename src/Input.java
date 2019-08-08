import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Input {


    public void addContact(String first, String last, String num) {

        Path dataFile = Paths.get("data", "contacts.txt");
        String name = first + " " + last;
        String info = name + " | " + num;
        List<String> contacts = Arrays.asList(info);

        try {
            Files.write(dataFile, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
    }


//        dataFile Files.write(Path filepath, List<String> lines[, StandardOpenOption option])

    }

}
