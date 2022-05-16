package com.company;


public class Main {

    // What is a package?
    // A package is a system for identifying unique classes

    // What is an access modifier?
    // keywords like public, private, protected regulate what aspects
    // of your code are available to other aspects

    // What is an instance of a class?
    // This is the process of creating an object itself.
    // This is done using a constructor

    // What is a class?
    // A class is a blueprint for creating objects

    // Fields represent the properties or attributes of the object

    public static void main(String[] args) {
	    // call the return average method with any number of
        // arguments
        // 1 2 3 4 5
        System.out.println(returnAverage(1, 2, 3, 4, 5));
        Person person = new Person("person", 22);
//        person.setName("person");
        System.out.println(person.getName());
        System.out.println(person.getAge());

        Person fred = new Person("Fred", 23);
//        fred.setName("Fred");
        System.out.println(fred.getName());
        System.out.println(fred.getAge());


        Person george = new Person("George", 20);
//        george.setName("George");
        System.out.println(george.getName());
        System.out.println(george.getAge());
        System.out.println(person);

    }

    public static float returnAverage(int ...numbers) {
        // variable arguments are returned as an array
        float sum = 0; // initialize sum variable to zero

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        return sum / numbers.length;
    }

    //
}
