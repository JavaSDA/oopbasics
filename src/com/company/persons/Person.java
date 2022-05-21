package com.company.persons;

public class Person {

    // Write a person class that has the following fields:
    // name, age
    // getters and setters

    // Define properties
    private String name;
    private int age;

    // Define constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }
}
