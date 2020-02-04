package com.company.libraryIS;
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

    public Reader(String firstName, String lastName, Date validityDate, String telephoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.cardNumber = cardNumber;
        this.validityDate = validityDate;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

   public static void newReader() {
        Scanner sc = new Scanner(System.in);

       System.out.println("Welcome in guide to create a new account in our library. Please fill these credentials.");

        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        /*System.out.print("Birthday: ");
        String birthday = sc.nextLine(); */
        System.out.print("Telephone number: ");
        String telephoneNumber = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();


        System.out.println("Your name is: " + firstName + " " + lastName + ",  Telephone number: " + telephoneNumber + ",  E-mail: " + email);

        System.out.println("Is it correct? y/n");
        String correct = sc.next();

        if(correct.equals("y") || correct.equals("yes")) {
            System.out.println("Your account was successfully created.");
            int cardNumber = new Random().nextInt((999999-100000));
            System.out.println("Your card number is: " + cardNumber);

            Calendar cal = Calendar.getInstance();
            Date today = cal.getTime();
            cal.add(Calendar.YEAR, 2); // to get previous year add -1
            Date nextYear = cal.getTime();

            Date validityDate = nextYear;
            System.out.println("Validity date your account: " + nextYear);

            Reader newReaderCreate = new Reader(firstName, lastName, validityDate, telephoneNumber, email);
        } else {
            System.out.println("You need to edit your credentials.");
        }
    }

    public static void findReader() {

    }

    public void readerHasValidAccount() {

    }

    public void whichBooksHasReaderBorrowed() {

    }
}
