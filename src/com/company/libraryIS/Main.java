package com.company.libraryIS;


import javax.xml.crypto.Data;
import java.util.Scanner;

import static com.company.libraryIS.Book.*;
import static com.company.libraryIS.LibraryBranch.showBranches;
import static com.company.libraryIS.Reader.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //create scanner for input
        String command; //new variable
        createBookDefault(); //creating a default book
        newReaderDefault(); //creating a default reader

        System.out.print("Welcome in Library information system. Please write a command (If you don't know any commands, write help): "); //first line after run

        while (true) { // infinite loop
            switch (command = scanner.nextLine()) { //first input to write a command or help
                case "help" : //if you write a help or other commands bellow, this happens
                    System.out.println("Commands are: " + HelperClass.commands()); //showing a commands from HelperClass
                    break;
                case "newBook":  newBook(); //start a method newBook from class Book
                    break;
                case "newReader": newReader(); //start a method newReader from class Reader
                    break;
                case "findBook": findBook(); //start a method findBook from class Book
                    break;
                case "findReader" : findReader(); //start a method findReader from class Reader
                    break;
                case "showDefaultBooks" : showDefaultBooks(); //start a method showDefaultBook from class Book
                    break;
                case "showDefaultReaders" : showDefaultReaders(); //start a method showDefaultReader from class Reader
                    break;
                case "showBranches" : showBranches(); //showBranchesInLibraryNetwork
                    break;
                case "exit" : System.exit(0); //exit the program
                default: System.out.println("Wrong command."); //in other case, if you put a wrong command in
            }
            System.out.print("Which command do you want to use?: "); //asking again after loop

        }
    }
}