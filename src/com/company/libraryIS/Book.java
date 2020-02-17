package com.company.libraryIS;

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

        System.out.println("New book is: " + newBookCreate + ".");

        System.out.println("Is it correct? y/n"); //condition below for check, if it's all ok
        String correct = scanner.next();

        if(correct.equals("y") || correct.equals("yes") || correct.equals("ye")) {
            Database.books.add(newBookCreate); //adding object to the list
            System.out.println("Book was successfully added to the library system. ");
            System.out.println("Your saved book is: " + newBookCreate); //saving to the list books
        } else {
            System.out.println("Book is needed to be edit.");
        }
    }

    public static void createBookDefault() { //set a default book to the variables
        Book defaultBook = new Book("DefaultBookName", "DefaultAuthor", "DefaultPublisher","DefaultLanguage", "DefaultGenre", false); //creating a new Object defaultBook
        Database.books.add(defaultBook); //adding a new Object defaultBook to the List
        Book defaultBook2 = new Book("DefaultBookName2", "DefaultAuthor2","DefaultPublisher2", "DefaultLanguage2", "DefaultGenre2", true);
        Database.books.add(defaultBook2);
        Book defaultBook3 = new Book("DefaultBookName3", "DefaultAuthor3", "DefaultPublisher3", "DefaultLanguage3", "DefaultGenre3", false);
        Database.books.add(defaultBook3);
    }

    public static void showDefaultBooks() { //should show your default books
       System.out.println("Default books are: " + Database.books.toString()); // using toString for better reading
    }

    public static Book findBook() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Write a name of the book, which you want to find: ");
       String name = scanner.nextLine();
       for  (int i = 0; i < Database.books.size(); i++){
          Book book =  Database.books.get(i);
          String bookName = book.bookName;
           if (name.equals(bookName)) {
               return book;
            }
        }
        return null;
    }

    public static void isAvailable() {
       Book bookIsFound = findBook();
       if (bookIsFound != null) {
           if (bookIsFound.isBorrowed) {
               System.out.println("Book is borrowed.");
           } else {
               System.out.println("Book is free.");
           }
       }
    }

    public static Book getAuthor() { //if author is in the database, show me and his book
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please write a name of the author: ");
       String nameAuthor = scanner.nextLine();
       for(int i = 0; i < Database.books.size(); i++) {
           Book authorOfBook = Database.books.get(i);
           String authorName = authorOfBook.author;
           if(nameAuthor.equals(authorName)) {
               System.out.println("Author " + authorName + " has this book: " + authorOfBook.bookName); //show authors book, just if he has one
               return authorOfBook;
           }
       }
       return null;
    }
}