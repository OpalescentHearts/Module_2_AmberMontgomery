import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Boolean found = false;
        Contact myObject = new Contact();
        String[] myContacts = {};
        String[] myContactNew = {};
//        ArrayList<String> myContacts = new ArrayList<>();
//        ArrayList<ArrayList> myContactNew = new ArrayList<>();
        System.out.println("Welcome to your Contacts List!");
        while (true) {
            Scanner questionMain = new Scanner(System.in);
            String answerMain;
            System.out.println("\n" + "[Create], view [All], [Update], [Delete], or [Quit]?");
            answerMain = questionMain.nextLine();
            System.out.println(answerMain);
            if (answerMain.equals("Create")) {
                Scanner questionName = new Scanner(System.in);
                System.out.println("\nName:");
                myObject.answerName = questionName.nextLine();
                Scanner questionEmail = new Scanner(System.in);
                System.out.println("Email:");
                myObject.answerEmail = questionEmail.nextLine();
                Scanner questionPhone = new Scanner(System.in);
                System.out.println("Phone:");
                myObject.answerPhone = questionPhone.nextLine();
                Scanner questionFavorite = new Scanner(System.in);

                myContacts.add("\nName: " + myObject.answerName + "\n" + "Email: " + myObject.answerEmail + "\n" + "Phone: " + myObject.answerPhone + "\n");



            } else if (answerMain.equals("All")) {
                for (String i : myContacts) {
                    System.out.print(i + "\n");
                }
            } else if (answerMain.equals("Update")) {
                Scanner questionName2 = new Scanner(System.in);
                String answerName2;
                System.out.println("\nName: ");
                answerName2 = questionName2.nextLine();
                System.out.println(answerName2);

            } else if (answerMain.equals("Delete")) {
                Scanner questionName3 = new Scanner(System.in);
                String answerName3;
                System.out.println("\nName: ");
                answerName3= questionName3.nextLine();
                System.out.println(answerName3);

            } else if (answerMain.equals("Quit")) {
                break;
            }
        }
    }
}
