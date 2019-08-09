//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input yesno = new Input();

        boolean i = true;

       do {
           System.out.println();
           System.out.println("Welcome!");
           System.out.println("-----------------------------------");
           System.out.println("1. View Contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.");
           System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        int answer = sc.nextInt();

           switch (answer) {
               case 1:
                   yesno.viewContact();
                   break;
               case 2:
                   yesno.addContactsAction();
                   break;
               case 3:
                   yesno.searchContacts();
                   break;
               case 4:
                   yesno.deleteContacts();
                   break;
               default:
                   System.out.println("Goodbye.");
                   i = false;
                   break;
           }
       } while (i);
    }
}
