package com.company.libraryIS;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Book> books = new ArrayList<>(); //proměnná jedinečná v celém projektu
    public static List<Reader> readers = new ArrayList<>();
    public static List<Book> defaultbook = new ArrayList<>();
    public static List<Reader> defaultreader = new ArrayList<>();
}