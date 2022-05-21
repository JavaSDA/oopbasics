package com.company;

public class Animal {
    
    // 25 mins.
    // Write a class called Animal, and it should the following features
    // Features: name, numOfLegs, sound...
    // Behaviour: They make sounds, They can walk
    
    // Define Features
    private String name;
    private int numOfLegs;
    private String sound;
    
    // Constructor
    public Animal(String name, int numOfLegs, String sound) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.sound = sound;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    
    void makeSound() {
        System.out.println(name + " says " + sound);
    }
    
    public void getMovement() {
        if (numOfLegs > 2) {
            System.out.println(name + " is walking");
        }
        else System.out.println(name + " cannot walk");
    }

}
