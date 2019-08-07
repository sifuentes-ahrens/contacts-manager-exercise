import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String folderPath = "./data";
        Path dataFile = Paths.get(folderPath, "contacts.txt");
        List<String> stringList = Arrays.asList("woof","bark","borf");
        List<String> moreAnimals = Arrays.asList("meow","hiss","lick");
        try {
//            if (Files.notExists(Paths.get(folderPath))) {
//                Files.createDirectory(Paths.get(folderPath));
//            }
            if (Files.exists(dataFile)) {
                Files.write(
                        dataFile,
                        stringList,
                        StandardOpenOption.APPEND
                );

            }
            List<String> lines = Files.readAllLines(dataFile);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
