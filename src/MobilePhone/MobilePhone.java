package MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner (System.in);
  private ArrayList<Contacts> phoneContacts;
  private String phoneName;


    public MobilePhone( String phoneName) {
        this.phoneContacts = new ArrayList<Contacts>();
        this.phoneName = phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void addPhoneContacts(Contacts contacts){
        System.out.println("Adding " + contacts.getName() +" into " + phoneName );
        phoneContacts.add(contacts);
    }

    public void displayPhoneContacts(){
        System.out.println("-------------------------------------");
        System.out.println(phoneContacts.size() + " contacts in the " + phoneName+"\n");
        for (int i=0; i<phoneContacts.size(); i++){
            System.out.println(i+1 + ". Contact Name : " + phoneContacts.get(i).getName() + "  |  Numbers : " + phoneContacts.get(i).getNumber());
        }
        System.out.println("-------------------------------------");
    }

    public void modifyPhoneContacts(){
        System.out.print("Please enter the name you want to modify : ");
        String name = scanner.nextLine();
        int index = findIndex(name);
        if (index < 0){
            System.out.println("Can not find the name in Contacts");
        }else{
            System.out.println(name + " is in the contacts");
            System.out.println("Please enter the new contacts name : ");
            phoneContacts.get(index).setName(scanner.nextLine());
            System.out.println("Changing Name succeed, print out the current Contacts\n");
            displayPhoneContacts();
        }



    }

    public int findIndex(String name){
       for (int i=0; i<phoneContacts.size(); i++){
           if (phoneContacts.get(i).getName().equals(name)  ){
               return i;
           }
       }
       return -1;
    }

    public void deleteContacts(){
        System.out.print("Please enter the name you want to delete : ");
        String name = scanner.nextLine();

        int index = findIndex(name);
        if (index < 0){
            System.out.println("Can not find the name in Contacts");
        }else{
            phoneContacts.remove(index);
            System.out.println("Deleting succeed, print out the current Contacts\n");

            displayPhoneContacts();
        }



    }


} // end of class

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.

// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.




// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.