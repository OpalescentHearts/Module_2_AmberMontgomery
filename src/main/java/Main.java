import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Contact myObject = new Contact();
        ArrayList<String> myContacts = new ArrayList<>();
//        ArrayList<ArrayList> myContactz = new ArrayList<>();
        System.out.println("Welcome to your Contacts List!");
        while (true){
            Scanner questionMain = new Scanner(System.in);
            String answerMain;
            System.out.println("\n" + "[Create], view [All], view by [Name], [Update], [Delete], or [Quit]?");
            answerMain = questionMain.nextLine();
            System.out.println(answerMain);
            if (answerMain.equals("Create")){
                Scanner questionName = new Scanner(System.in);
                System.out.println("Name:");
                myObject.answerName = questionName.nextLine();
                Scanner questionEmail = new Scanner(System.in);
                System.out.println("Email:");
                myObject.answerEmail = questionEmail.nextLine();
                Scanner questionPhone = new Scanner(System.in);
                System.out.println("Phone:");
                myObject.answerPhone = questionPhone.nextLine();
                Scanner questionFavorite = new Scanner(System.in);

                myContacts.add(myObject.answerName + " - " + myObject.answerPhone + " - " + myObject.answerPhone);

//                myContacts.add(myObject.answerEmail);
//                myContacts.add(myObject.answerPhone);


            } else if (answerMain.equals("All")) {
                for (String i : myContacts){
                    System.out.print(i + "\n");
                }
            } else if (answerMain.equals("Name")) {

            } else if (answerMain.equals("Quit")) {
                break;
            }
        }
//            Contact myObj = new Contact();
//            System.out.println(myObj.answerName);
        }
    }


//            if (questionFavorite.equals (true)){
//                answerFavorite = true;
//            }
//            else-if(questionFavorite.equals(false)){
//                answerFavorite = false;
//                }
//            System.out.println("Name:" + answerName + "\n" + "Email:" + answerEmail + "\n" + "Phone:" + answerPhone);


//        email = input("Email: ")
//        phone = input("Phone: ")
//        favorite = input("Favorite? ")

//        else if (answerMain.equals("all")){
//            System.out.println("All boop");
//        }
//        else if (answerMain.equals("name")){
//            System.out.println("Names go brr");
//        }
//        else if (answerMain.equals("favorites")){
//            System.out.println("Favorites go brrr");
//        }
//        else if (answerMain.equals("delete")){
//            System.out.println("It do be deleted");
//        }
//        else if (answerMain.equals("quit")){
//            System.out.println("oh wow ok quitter smh");
//            break;
//        }
//        }
//    }






//        if user_input == "create":
//        name = input("Name: ")
//        email = input("Email: ")
//        phone = input("Phone: ")
//        favorite = input("Favorite? ")
//        if favorite == "yes":
//        grape = True
//        else:
//        grape = False
//        contact = Contact(name, email, phone, grape)
//
//
//        list.append(contact)
//        elif user_input == "all":
//        for apple in list:
//        if apple.is_favorite == True:
//        isfavorite = "Favorite"
//        else:
//        isfavorite = "Not Favorite"
//        contactstring = (f"{apple.name} - {apple.email} - {apple.phone} - {isfavorite}")
//        print(contactstring)
//        elif user_input == "name":
//        apple = input("Name: ")
//        found = False
//        for mango in list:
//        if mango.name == apple:
//        found = True
//        contactstring = (f"{mango.name} - {mango.email} - {mango.phone} ")
//        if mango.is_favorite == True:
//        print(contactstring + "- Favorite")
//        else:
//        print(contactstring + "- Not Favorite")
//        if found == False:
//        print("Contact not found")
//        elif user_input == "favorites":
//        for tomato in list:
//        if tomato.is_favorite:
//        newcontactstring = (f"{tomato.name} - {tomato.email} - {tomato.phone}")
//        print(newcontactstring)
//        elif user_input == "update":
//        olive = input("Name: ")
//        found = False
//        for avocado in list:
//        if avocado.name == olive:
//        found = True
//        updateemail = input("Email: ")
//        updatephone = input("Phone: ")
//        updatefavorite = input("Favorite? ")
//        if updatefavorite == "yes":
//        breadfruit = True
//        else:
//        breadfruit = False
//        contact = Contact(olive, updateemail, updatephone, breadfruit)
//        index = list.index(avocado)
//        list[index] = contact
//        if found == False:
//        print("Contact not found")
//        elif user_input == "delete":
//        cantaloupe = input("Name: ")
//        found = False
//        for watermelon in list:
//        if watermelon.name == cantaloupe:
//        found = True
//        list.remove(watermelon)
//        if found == False:
//        print("Contact not found")
//        elif user_input == "quit":
//        break
//        else:
//        print("Invalid action")
//        if __name__ == "__main__":
//        main()
