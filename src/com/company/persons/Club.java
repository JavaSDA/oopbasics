package com.company.persons;

public class Club {
    // Write a class called Club and
    // it has two fields: name(String) and members(Persons[])
    // And a method to find the average age of the members of each club
    // instance.

    // Define properties
    private String name;
    private Person[] members;


    public Club(String name, Person[] members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public float getAverageAge() {
        float sum = 0;

        for (Person person : members) {
            sum += person.getAge();
        }

        return sum / members.length;
    }
}


// Task duration: 30mins