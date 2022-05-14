package com.company;

public class Person {
    // Define the properties of the object
    private String name; // field
    private int age;

    // Conventions for methods
    // - Make sure it's concise (do only one action)
    // - Name your methods with verbs

//    public Person() {
//        // default constructor
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
