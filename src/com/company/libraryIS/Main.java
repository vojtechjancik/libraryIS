package com.company.libraryIS;


import javax.xml.crypto.Data;
import java.util.Scanner;

import static com.company.libraryIS.Book.*;
import static com.company.libraryIS.Reader.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        newBookDefault();
        newReaderDefault();
        String command;
        System.out.print("Welcome in Library information system. Please write a command (If you don't know any commands, write help): ");

        while (true) {
            switch (command = scanner.nextLine()) {
                case "help" :
                    System.out.println("Commands are: " + HelperClass.commands());
                    break;
                case "newBook":  newBook();
                    break;
                case "newReader": newReader();
                    break;
                case "findBook": findBook();
                    break;
                case "findReader" : findReader();
                    break;
                case "exit" : System.exit(0);
                default: System.out.println("Wrong command.");
            }
            System.out.print("Which command do you want to use?: ");
        }
    }
}