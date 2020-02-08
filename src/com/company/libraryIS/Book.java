package com.company.libraryIS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    String bookName; //defining variables
    String author;
    String publisher;
    String language;
    /*long isbn;
    int numberOfPages;
    int released; */
    String genre;
    boolean isBorrowed = false;

   public Book(String bookName, String author, String publisher, String language, String genre, boolean isBorrowed) { //contructor with variables
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
        /*this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.released = released; */
        this.genre = genre;
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() { //method for converting list to String
        return bookName + ", " + author + ", " + publisher + ", " + language + ", " + genre + ", " + isBorrowed;
    }

    public static void newBook() { //creating new book
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guide to add book to the library system");

        System.out.print("Name of the book: ");
        String bookName = scanner.nextLine(); //saving input to the variables
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Paperback: ");
        String paperback = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Language: ");
        String language = scanner.nextLine();
        /*System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Number of pages: ");
        String numberOfPages = scanner.nextLine();
        System.out.print("Released: ");
        String releasedate = scanner.nextLine(); */
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        boolean isBorrowed = false;
        System.out.println();

        Book newBookCreate = new Book(bookName, author, publisher, language, genre, isBorrowed);  //creating a new Object

        Database.books.add(newBookCreate); //adding object to the list

        System.out.println("New book is: " + Database.books.toString() + "."); //showing a coverted book to the string for better reading

        System.out.println("Is it correct? y/n"); //condition below for check, if it's all ok
        String correct = scanner.next();

        if(correct.equals("y") || correct.equals("yes") || correct.equals("ye")) {
            System.out.println("Book was successfully added to the library system. ");
            System.out.println("Your saved book is: " + Database.books.toString()); //saving to the list books
        } else {
            System.out.println("Book is needed to be edit.");
        }
    }

    public static void createBookDefault() { //set a default book to the variables
        Book defaultBook = new Book("DefaultBookName", "DefaultAuthor", "DefaultPublisher","DefaultLanguage", "DefaultGenre", false); //creating a new Object defaultBook
        Database.books.add(defaultBook); //adding a new Object defaultBook to the List
        Book defaultBook2 = new Book("DefaultBookName2", "DefaultAuthor2","DefaultPublisher2", "DefaultLanguage2", "DefaultGenre2", true);
        Database.books.add(defaultBook2);
    }

    public static void showDefaultBooks() { //should show your default book
       System.out.println("Default books are: " + Database.books.toString()); // using toString for better reading
    }

    public static void findBook() { //WIP - find book from database
       Scanner scanner = new Scanner(System.in);
       System.out.print("Write a name of the book, which you want to find: ");
       String name = scanner.nextLine();
       //add for cycle
       /* if (Database.books.equals(findBook)) {
            System.out.println("Book exists.");
        } else {
            System.out.println("Book doesn't exists.");
        } */
        boolean listContainsInput = false;
        for  (int i = 0; i < Database.books.size(); i++){
            if (name.equals(Database.books.get(i).bookName)) {
                listContainsInput = true;
                break;
            }
        }
        if(listContainsInput) {
                System.out.println("Book is in the library system.");
            } else {
                System.out.println("Book is not in the library system.");
            }
    }

    public void isAvailable() {

    }
}