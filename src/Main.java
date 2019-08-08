//import java.io.File;
//import java.io.IOException;
//import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Input stuff = new Input();

        do {

        stuff.addContact("aaron", "sifuentes", "2105494492");
        } while (true);





//        String folderPath = "./data";
//        Path dataFile = Paths.get("./data","addresses.txt");
//        File readFile = new File("/Users/Smilez/IdeaProjects/untitled/data");
//        Contact aaron = new Contact("Aaron", "2104921012");
//        Contact dave = new Contact("David", "2104921012");
//
//
//        System.out.println("Enter a name: ");
//        String name = scan.nextLine();
//        System.out.println("Enter a number: ");
//        String num = scan.nextLine();
//
//        Contact con = new Contact(name,num);
//
//        List<String> contactsList = Arrays.asList(con.getName());
//
//        for (String contact: contactsList) {
//            try {
//        Scanner read = new Scanner(readFile);
//        System.out.println(read.nextLine());
//                Files.write(
//                        dataFile,
//                        Arrays.asList(stuff.printName(con)),
//                        StandardOpenOption.APPEND
//                );
//                Files.write(
//                        dataFile,
//                        contact.getPhoneNum(),
//                        StandardOpenOption.APPEND
//                );

//                System.out.println(Files.readAllLines(Paths.get("./data", "addresses.txt")));
//            } catch (Exception e) {
//                System.out.println("error");
//            }
        }


        //        Files.write(dataFile, contactsList);




//        System.out.println(aaron.getName());
//        List<String> moreAnimals = Arrays.asList("meow","hiss","lick");
//        try {



//            if (Files.notExists(Paths.get(folderPath))) {
//                Files.createDirectory(Paths.get(folderPath));
//            }
//            if (Files.exists(dataFile)) {
//                Files.write(
//                        dataFile,
//                        (Iterable<? extends CharSequence>) contactsList,
//                        StandardOpenOption.APPEND
//                );

//              }
//            List<String> lines = Files.readAllLines(dataFile);
//            for (String line: lines) {
//                System.out.println(line);
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
