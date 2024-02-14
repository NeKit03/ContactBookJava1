package org.example.ContactBook;
import java.util.Scanner;


public class Menu {
  public static void StartPhoneBook(){
      Scanner in = new Scanner(System.in);
      PhoneBook phoneBook = new PhoneBook();
      while (true) {
          Print.printMenu();
          switch (in.next()){
              case ("1"):
                  phoneBook.printContacts();
                  break;
              case ("2"):
                  phoneBook.addContact(Print.nextContactName(),Print.nextContactNumber());
                  break;
              case ("3"):
                  phoneBook.removeContact(Print.nextContactName());
                  break;
              case ("4"):
                  Contact contact=phoneBook.getContact(Print.nextContactName());
                  if(contact!=null)
                    Print.printContact(contact);
                  else
                    Print.errorKey(2);
                  break;
              case ("0"):
                  Print.endContactBook();
                  System.exit(0);
                  break;
              default:
                  Print.errorKey(1);
                  break;

          }

      }
  }
}
