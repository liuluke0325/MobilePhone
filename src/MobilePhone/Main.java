package MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    private static MobilePhone mobilePhone = new MobilePhone("Test");
    public static void main(String [] args){
        Contacts luke = new Contacts("Luke",1234567 );
        Contacts eva = new Contacts("Eva",23456789 );
//        System.out.println("--------Test add phone---------");
//        mobilePhone.addPhoneContacts(luke);
//        mobilePhone.addPhoneContacts(eva);
//        System.out.println("--------Test display phone---------");
//        mobilePhone.displayPhoneContacts();
//        System.out.println("--------Test changing phone---------");
//        mobilePhone.modifyPhoneContacts();
//        System.out.println("--------Test deleting phone---------");
//        mobilePhone.deleteContacts();

        boolean flag = true;


        do {

            displayMenu();
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select){

                case 1:
                    mobilePhone.addPhoneContacts(luke);
                    mobilePhone.addPhoneContacts(eva);
                    break;
                case 2:
                    mobilePhone.displayPhoneContacts();
                    break;
                case 3:
                    mobilePhone.deleteContacts();
                    break;
                case 4:
                    mobilePhone.modifyPhoneContacts();
                    break;
                case 0 :
                    flag = false;
                    System.out.println("Closing.....");
                    break;

                default:
                    System.out.println("Please Enter the correct number");
            }

        }while(flag);
    }


    public static void  displayMenu(){

        System.out.println("\n1. Add Contact");
        System.out.println("2. Display Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Modify Contact");
        System.out.println("0. Exit\n");
    }









}
