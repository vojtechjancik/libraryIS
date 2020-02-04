package com.company.libraryIS;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String bookName;
    String author;
    String publisher;
    String language;
    /*long isbn;
    int numberOfPages;
    int released; */
    String genre;
    boolean isBorrowed = false;

   public Book(String bookName, String author, String publisher, String language, String genre, boolean isBorrowed) {
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
    public static void newBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guide to add book to the library system");

        System.out.print("Name of the book: ");
        String bookName = scanner.nextLine();
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

        Book newBookCreate = new Book(bookName, author, publisher, language, genre, isBorrowed);

        Database.books.add(newBookCreate);



        System.out.print("New book is: " + Database.books);

         /*System.out.println("Check your input: " + "Name: " + bookName + ", " + "Author: " + author + ", " + "Paperback: "
                + paperback + ", " + "Publisher: " + publisher + ", " + "Language: " + language + ", " + "ISBN: " + isbn + ", " + "Released: "
                + releasedate + ", " + "Genre: " + genre + "."); */

        System.out.println("Is it correct? y/n");
        String correct = scanner.next();

        if(correct.equals("y") || correct.equals("yes")) {
            System.out.println("Book was successfully added to the library system.");
            System.out.println("Your saved book is: " + Database.books);
        } else {
            System.out.println("Book is needed to be edit.");
        }
    }

    public static void newBookDefault() {
    }

    public static void showBook() {
        System.out.println(Database.books);
    }
    public static void findBook() {
       Scanner findBook = new Scanner(System.in);
       System.out.print("Write a name of the book, which you want to find: ");
       String findingBook = findBook.nextLine();
        if (Database.books.contains(findingBook)) {
            System.out.println("Book exists.");
        } else {
            System.out.println("Book doesn't exists.");
        }
    }

    public void isAvailable() {

    }
}
