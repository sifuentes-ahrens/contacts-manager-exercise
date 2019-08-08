import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input yesno = new Input();
       do {
        System.out.println("Please enter a number: ");
        int answer = sc.nextInt();
           switch (answer) {
               case 1:
                   yesno.searchContacts();
                   break;
               case 2:
                   yesno.showAddContacts();
                   break;
               case 3:
                   System.out.println("You pressed three!");
                   break;
               case 4:
                   System.out.println("You pressed four!");
                   break;
               default:
                   System.out.println("You broke it. Good job.");
                   break;
           }
       } while (yesno.yesNo());
    }
}
