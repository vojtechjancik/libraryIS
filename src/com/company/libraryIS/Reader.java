package com.company.libraryIS;
import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Reader {
    String firstName;
    String lastName;
    //int cardNumber = 0;
    Date validityDate;
    String telephoneNumber;
    String email;

    public Reader(String firstName, String lastName, Date validityDate, String telephoneNumber, String email) { //constructor with variables
        this.firstName = firstName;
        this.lastName = lastName;
        //this.cardNumber = cardNumber;
        this.validityDate = validityDate;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public Reader(String firstName, String lastName, String telephoneNumber, String email) { //different constructor without validityDate
        this.firstName = firstName;
        this.lastName = lastName;
        //this.cardNumber = cardNumber;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    @Override
    public String toString() { //method for converting list to String
        return firstName + ", " + lastName + ", " + telephoneNumber + ", " + email;
    }

   public static void newReader() { //creating a new reader
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome in guide to create a new account in our library. Please fill these credentials.");

        System.out.print("First name: ");
        String firstName = scanner.nextLine(); //saving to the variable firstName
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        /*System.out.print("Birthday: ");
        String birthday = sc.nextLine(); */
        System.out.print("Telephone number: ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();


        System.out.println("Your name is: " + firstName + " " + lastName + ",  Telephone number: " + telephoneNumber + ",  E-mail: " + email); //check, if it's correct

        System.out.println("Is it correct? y/n");
        String correct = scanner.next();

        if(correct.equals("y") || correct.equals("yes") || correct.equals("ye")) { //if condition is true
            System.out.println("Your account was successfully created.");
            int cardNumber = new Random().nextInt((999999-100000)); //6 digits for random card number for new reader
            System.out.println("Your card number is: " + cardNumber); //show new card number

            Calendar cal = Calendar.getInstance();
            Date today = cal.getTime();
            cal.add(Calendar.YEAR, 2); // to get previous year add -1
            Date nextYear = cal.getTime();

            Date validityDate = nextYear;
            System.out.println("Validity date your account: " + nextYear);

            Reader newReaderCreate = new Reader(firstName, lastName, validityDate, telephoneNumber, email); //create new Object newReaderCreate
            Database.readers.add(newReaderCreate); //add new object to the list readers
        } else {
            System.out.println("You need to edit your credentials.");
        }
    }

    public static void newReaderDefault() {
        Reader defaultReader = new Reader("DefaultFirstName",  "DefaultLastName", "Default123456789", "DefaultEmail");
        Database.readers.add(defaultReader);
        Reader defaultReader2 = new Reader("DefaultFirstName2", "DefaultLastName2", "Default123456789", "DefaultEmail2");
        Database.readers.add(defaultReader2);
        Reader defaultReader3 = new Reader("DefaultFirstName3", "DefaultLastName3", "Default123456789", "DefaultEmail3");
        Database.readers.add(defaultReader3);
    }

    public static void findReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a last name of the reader, which you want to find: ");
        String name = scanner.nextLine();
        boolean listContainsInput = false;
        for  (int i = 0; i < Database.readers.size(); i++){
            if (name.equals(Database.readers.get(i).lastName)) {
                listContainsInput = true;
                break;
            }
        }
        if(listContainsInput) {
            System.out.println("Reader is in the library system.");
        } else {
            System.out.println("Reader is not in the library system.");
        }
    }

    public static void showDefaultReaders() {

        System.out.println("Default reader is: " + Database.readers.toString());
    }

    public void readerHasValidAccount() {

    }

    public static void borrowBook() {  //WIP

    }

    public void whichBooksHasReaderBorrowed() {

    }
}