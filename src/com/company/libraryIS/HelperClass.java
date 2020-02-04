package com.company.libraryIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelperClass {

    public static List<String> commands() {
        return Arrays.asList("help", "exit", "newBook", "newReader", "findBook");
    }
}