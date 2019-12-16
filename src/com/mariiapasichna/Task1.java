package com.mariiapasichna;

import java.util.Arrays;

public class Task1 {

    /*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько
имен и выбирать из него случайным образом).

1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.*/

    public static void main(String[] args) {
        Person person = new Person();
        Person[] persons = new Person[100];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(person.getName(), person.getSurname(), person.getAge(), person.getWeight(), person.getHeight());
            System.out.println(persons[i]);
        }
    }
}