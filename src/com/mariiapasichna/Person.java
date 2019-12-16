package com.mariiapasichna;

import java.util.Random;

public class Person {

    private String name;
    private String surname;
    private int age;
    private double weight;
    private int height;

    public Person() {
    }

    public Person(String name, String surname, int age, double weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        String[] names = {"Mariia", "Anna", "Andrey", "Pavel", "Vitaly"};
        int nameIndex = new Random().nextInt(names.length);
        name = names[nameIndex];
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        String[] surnames = {"Litvinchuk", "Zholud", "Ignatenko", "Petrenko", "Chernenko"};
        int nameIndex = new Random().nextInt(surnames.length);
        surname = surnames[nameIndex];
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age = new Random().nextInt(42) + 18;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight = new Random().nextInt(55) + 45;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height = new Random().nextInt(30) + 160;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}