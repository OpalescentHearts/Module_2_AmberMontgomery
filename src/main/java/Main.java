import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class Main {
    public static void main(String args[]) {
        HashMap<String, String> userData = new HashMap<String, String>();
        System.out.println("\nWelcome to the random item generator! \nHere you can put up to 10 items into a list and we'll make the decision for you!");
        while (true) {
            Scanner questionMain = new Scanner(System.in);
            System.out.println("Pick an option \n[Create], Pick [Random] item, [Delete], [View], or [Quit]");
            String answerMain;
            answerMain = questionMain.nextLine();


            if(answerMain.equals("Create")){
                Scanner questionCreate = new Scanner(System.in);
                System.out.println("Do you want to create a new [List] or [Add] to the previous one?");
                String answerCreate;
                answerCreate = questionCreate.nextLine();
                if (answerCreate.equals("List")){
                    Scanner questionList = new Scanner(System.in);
                    System.out.println("Warning if you create a new list you must delete the previous one do you wish to continue? \n[Yes] / [No]");
                    System.out.println(userData);
                    String answerList;
                    answerList = questionList.nextLine();
                    if (answerList.equals("Yes")){
                        userData.clear();
                        Scanner questionList2 = new Scanner(System.in);
                        System.out.println("First item of the list?");
                        String answerList2;
                        answerList2 = questionList2.nextLine();
                        userData.put("", answerList2);
                        System.out.println(userData);
                    }
                    if (answerList.equals("No")){
                        System.out.println("Redirecting....");
                    }
                }
                if (answerCreate.equals("Add")){
                    System.out.println(userData);
                    Scanner questionAdd = new Scanner(System.in);
                    System.out.println("New item: ");
                    String answerAdd;
                    answerAdd = questionAdd.nextLine();
                    userData.put("", answerAdd);
                    System.out.println(userData);
                }
//                userData.put("Last Name", "Smith");
//                userData.put("Age", "405");
//                userData.put("Username", "OnComingStorm");
//                for (String key : userData.keySet()) {
//                    System.out.println( key + ": " + userData.get( key ));
//                }
            }
            if(answerMain.equals("Random")){
                System.out.println("Pick a list");
                System.out.println("List of list goes here lmao");
                Scanner questionRandom = new Scanner(System.in);
            }
            if(answerMain.equals("Delete")){
                System.out.println("Deleted");
                Scanner questionDelete = new Scanner (System.in);
            }
            if(answerMain.equals("View")){
                System.out.println(userData);
            }
            if(answerMain.equals("Quit")){
                System.out.println("Goodbye :)");
                break;
            }
        }
    }
}

//        Boolean found = false;
//        Contact myObject = new Contact();
//        ArrayList<String> myContacts = new ArrayList<>();
//        ArrayList<ArrayList> myContactNew = new ArrayList<>();
//        System.out.println("Welcome to your Contacts List!");
//        while (true) {
//            Scanner questionMain = new Scanner(System.in);
//            String answerMain;
//            System.out.println("\n" + "[Create], view [All], [Update], [Delete], or [Quit]?");
//            answerMain = questionMain.nextLine();
//            System.out.println(answerMain);
//            if (answerMain.equals("Create")) {
//                Scanner questionName = new Scanner(System.in);
//                System.out.println("\nName:");
//                myObject.answerName = questionName.nextLine();
//                Scanner questionEmail = new Scanner(System.in);
//                System.out.println("Email:");
//                myObject.answerEmail = questionEmail.nextLine();
//                Scanner questionPhone = new Scanner(System.in);
//                System.out.println("Phone:");
//                myObject.answerPhone = questionPhone.nextLine();
//
//                myContacts.add("\nName: " + myObject.answerName + "\n" + "Email: " + myObject.answerEmail + "\n" + "Phone: " + myObject.answerPhone + "\n");
//                System.out.println(myContacts);
////                myContactNew.add(myContacts);
////                System.out.println(myContactNew);
//
//
//            } else if (answerMain.equals("All")) {
//                for (String i : myContacts) {
//                    System.out.print(i + "\n");
//                }
//            } else if (answerMain.equals("Update")) {
//                Scanner questionName2 = new Scanner(System.in);
//                String answerName2;
//                System.out.println("\nName: ");
//                answerName2 = questionName2.nextLine();
////                System.out.println(answerName2);
//                for (String i : myContacts){
//                    if (i.contains(answerName2)){
//                        System.out.println("Hello");
//                        myContacts.remove(i);
//                    }
//                }
//                System.out.println(myContacts);
//
//

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

//            } else if (answerMain.equals("Quit")) {
//                break;
//            }
//        }
//    }
//}
