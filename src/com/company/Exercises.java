package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    static Scanner scanner = new Scanner(System.in); // Declared as a field

    public static void main(String[] args) {
//        getEvenOdd();
//        getVowelNumber();
//        getSmallest();
//        getAverageLength();
//        getEvenBeforeOdd();
        rearrangeArray();
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

    // 30 mins.
    // Write a method that asks a user to enter a range of numbers and
    // sort the numbers in such a way that even numbers come before the odd numbers.
    // Input: [7, 9, 4, 2, 8]
    // Output: [4, 2, 8, 7, 9]

    public static void getEvenBeforeOdd() {
        // Prompt the user to ask for how many numbers they want to enter
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate our array
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user for a number
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // initialize counter
        int counter = 0;

        // Check continuously for even numbers and count them
        while (counter < numbers.length && numbers[counter] % 2 == 0) counter++;

        for (int i = counter + 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int temp = numbers[counter];
                numbers[counter] = numbers[i];
                numbers[i] = temp;
                counter++;
            }
        }

        System.out.println(Arrays.toString(numbers));


    }


    // 30 mins
    // Write a method to rearrange this array in such a way that the element at every two indices is
    // greater than the elements to it's left and right.
    // The array is: {3, 5, 9, 10, 7, 2, 1}
    // Output: {1, 3, 2, 10, 5, 9, 7}

    public static void rearrangeArray() {
        int[] numbers = {5, 9, 11, 24, 6, 13};

        // Loop through the numbers array starting from the second element
        for (int i = 1; i < numbers.length; i += 2) {
            // check the number preceding every second element
            if (numbers[i - 1] > numbers[i]) {
                int temp = numbers[i-1]; // set it to the preceding number
                numbers[i-1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; // revive the temp value
            }

            // check  for the right side
            if (i + 1 < numbers.length && numbers[i + 1] > numbers[i]) {
                int temp = numbers[i+1]; // set it to the preceding number
                numbers[i+1] = numbers[i]; // set the preceding value to the current value
                numbers[i] = temp; // revive the temp value
            }
        }

        // output
        System.out.println("The resulting or rearranged array is: " + Arrays.toString(numbers));
    }


}
