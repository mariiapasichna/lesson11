package com.mariiapasichna;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MakePerson {

    private static final Random RANDOM = new Random();

    public static Person[] getPersons(int count) {
        Person[] persons = new Person[count];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = createRandomPerson();
        }
        return persons;
    }

    private static Person createRandomPerson() {
        int index = RANDOM.nextInt(DataProvider.getFirstNames().length);
        String firstName = DataProvider.getFirstNames()[index];
        index = RANDOM.nextInt(DataProvider.getLastNames().length);
        String lastName = DataProvider.getLastNames()[index];
        int age = RANDOM.nextInt(42) + 18;
        int height = RANDOM.nextInt(30) + 160;
        double bodyMassIndex = RANDOM.nextDouble() * 6.49 + 18.5;
        double weight = Math.pow(height, 2) * bodyMassIndex / 10000;
        weight = new BigDecimal(weight).setScale(1, RoundingMode.UP).doubleValue();
        return new Person(firstName, lastName, age, weight, height);
    }
}