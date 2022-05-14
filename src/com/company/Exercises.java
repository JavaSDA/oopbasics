package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    static Scanner scanner = new Scanner(System.in); // Declared as a field

    public static void main(String[] args) {
//        getEvenOdd();
//        getVowelNumber();
//        getSmallest();
        getAverageLength();
    }

    // 20 mins
    // Create a method that accepts a number of integers from a user and
    // returns the number of even and odd numbers from it
    // input: 5
    // 4, 6, 9, ..
    // output: odd: 2
    // even: 3

    public static void getEvenOdd() {
        // Prompt the user to ask for how many numbers they want to enter
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate our array
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user for a number
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // find the number of odd and even numbers
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("The number of odd numbers is: " + oddCount);
        System.out.println("The number of even numbers is: " + evenCount);
    }

    // 20 mins
    // Write a method to return the number of vowels present in a string
    // entered by the user.

    public static void getVowelNumber() {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // initialize a count for the vowels
        int vowelCount = 0;

        // Break the string into an array
        // turn it into lowercase to ensure a uniform check
        char[] chars = userInput.toLowerCase().toCharArray();

        // loop through the string and get the vowels
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }

        System.out.println("The number of vowels in the string '" + userInput + "' is: " + vowelCount);
    }


    // 20 mins
    // Write a method to find the smallest number in an array without using any of the
    // methods afforded by the Java Class.

    public static void getSmallest() {
        // Prompt the user to ask for how many numbers they want to enter
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate our array
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user for a number
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // initialize the smallest variable to the first element in the
        // array
        int smallest = numbers[0];

        // Loop through the array and compare other elements in the array
        // to find the smallest
        for (int i = 0; i < numbers.length; i++) {
            // if smallest is greater than the current value,
            // make it our new smallest value
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);
    }

    // 25 mins
    // Write a method to find the average length of an array of strings entered by the user.
    public static void getAverageLength() {
        // Prompt the user to ask for how many strings they want to enter
        System.out.print("How many strings do you want to enter?: ");
        String[] strings = new String[Integer.parseInt(scanner.nextLine())];

        // initialize a sum for the lengths of the string
        float sumOfLengths = 0;

        // Populate our array
        for (int i = 0; i < strings.length; i++) {
            // Prompt the user for a string
            System.out.print("Enter a string: ");
            strings[i] = scanner.nextLine();
        }

        // calculate the average
        for (int i = 0; i < strings.length; i++) {
            sumOfLengths += strings[i].length();
        }

        System.out.println("The average length of the strings entered is: " + sumOfLengths / strings.length);
    }

    // Write a method that accepts a number of integers from the user and
    // returns the percentage of odd numbers present in the array.
    // Input: [3, 8, 9, 10]
    // Output: The percentage of odd numbers is: 50%

}
