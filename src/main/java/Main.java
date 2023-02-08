import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
//        Boolean found = false;
        Contact myObject = new Contact();
        ArrayList<String> myContacts = new ArrayList<>();
        ArrayList<ArrayList> myContactNew = new ArrayList<>();
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

                myContacts.add("\nName: " + myObject.answerName + "\n" + "Email: " + myObject.answerEmail + "\n" + "Phone: " + myObject.answerPhone + "\n");
                System.out.println(myContacts);
//                myContactNew.add(myContacts);
//                System.out.println(myContactNew);


            } else if (answerMain.equals("All")) {
                for (String i : myContacts) {
                    System.out.print(i + "\n");
                }
            } else if (answerMain.equals("Update")) {
                Scanner questionName2 = new Scanner(System.in);
                String answerName2;
                System.out.println("\nName: ");
                answerName2 = questionName2.nextLine();
//                System.out.println(answerName2);
                for (String i : myContacts){
                    if (i.contains(answerName2)){
                        System.out.println("Hello");
                        myContacts.remove(i);
                    }
                }
                System.out.println(myContacts);



//                for(ArrayList a : myContactNew){
//                    System.out.println(a);
//                    System.out.println(myContacts);
//                    if(a.equals(myContacts) ){
//                        myContactNew.remove(myContacts);
//                        System.out.println("Booop");
//                        Scanner questionName3 = new Scanner(System.in);
//                        System.out.println("\nName:");
//                        myObject.answerName = questionName3.nextLine();
//                        Scanner questionEmail3 = new Scanner(System.in);
//                        System.out.println("Email:");
//                        myObject.answerEmail = questionEmail3.nextLine();
//                        Scanner questionPhone3 = new Scanner(System.in);
//                        System.out.println("Phone:");
//                        myObject.answerPhone = questionPhone3.nextLine();
//                        myContacts.add("\nName: " + myObject.answerName + "\n" + "Email: " + myObject.answerEmail + "\n" + "Phone: " + myObject.answerPhone + "\n");
//                        myContactNew.add(myContacts);
//                        System.out.println(myContactNew);
//
//                    }
//                }
//
//            } else if (answerMain.equals("Delete")) {
//                Scanner questionName2 = new Scanner(System.in);
//                String answerName2;
//                System.out.println("\nName: ");
//                answerName2 = questionName2.nextLine();
//                System.out.println(answerName2);
//                for(String a : myContacts){
//                    System.out.println(a);
//                    if(a.equals("\nName: " + myObject.answerName + "\n" + "Email: " + myObject.answerEmail + "\n" + "Phone: " + myObject.answerPhone + "\n") ){
//                        myContacts.remove(a);
//
//                    }
//                }

            } else if (answerMain.equals("Quit")) {
                break;
            }
        }
    }
}
