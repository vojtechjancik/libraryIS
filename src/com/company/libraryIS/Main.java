package com.company.libraryIS;


import java.util.Scanner;

import static com.company.libraryIS.Book.findBook;
import static com.company.libraryIS.Book.newBook;
import static com.company.libraryIS.Reader.newReader;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command;
        System.out.print("Welcome in information system of library. Please write a command (If you don't know any commands, write help): ");

        while (true) {
            switch (command = sc.nextLine()) {
                case "help" :
                    System.out.println("Commands are: " + HelperClass.commands());
                    break;
                case "newBook":  newBook();
                    break;
                case "newReader": newReader();
                    break;
                case "findBook": findBook();
                    break;
                case "exit" : System.exit(0);
                default: System.out.println("Wrong command");
            }
            System.out.print("Which command do you want to use?: ");
        }
    }
}