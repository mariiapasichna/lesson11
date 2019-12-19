package com.mariiapasichna;

public class DataProvider {
    private static String[] firstNames = {"Mariia", "Anna", "Andrey", "Pavel", "Vitaly"};
    private static String[] lastNames = {"Litvinchuk", "Zholud", "Ignatenko", "Petrenko", "Chernenko"};

    public static String[] getFirstNames() {
        return firstNames;
    }

    public static String[] getLastNames() {
        return lastNames;
    }
}