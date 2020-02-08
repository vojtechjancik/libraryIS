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
        String firstName;
        String lastName;
        String telephoneNumber;
        String email;

        Reader defaultReader = new Reader(firstName = "DefaultFirstName", lastName = "DefaultLastName", telephoneNumber = "Default123456789", email = "DefaultEmail");
        Database.readers.add(defaultReader);
        Reader defaultReader2 = new Reader(firstName = "DefaultFirstName2", lastName = "DefaultLastName2", telephoneNumber = "Default123456789", email = "DefaultEmail2");
        Database.readers.add(defaultReader2);
    }

    public static void findReader() {  // WIP - show first strings in readable way
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write please reader's first and last name: ");
        String findingReader = scanner.nextLine();
        if(Database.readers.contains(findingReader)) {
            System.out.println("Reader with name is exists.");
        } else {
            System.out.println("Reader with this name is not exists.");
        }
    }

    public static void showDefaultReaders() {
        System.out.println("Default reader is: " + Database.readers.toString());
    }
    public void readerHasValidAccount() {

    }

    public void whichBooksHasReaderBorrowed() {

    }
}