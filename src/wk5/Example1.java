/*
 * Course: CS 1021
 * Winter 2021
 * Demo
 * Name: Roby Velez
 * Created: 2/4/2022
 */
package wk5;

import java.util.Arrays;
import java.util.List;

/**
 * Practice stream problems with
 * an array of numbers and a Circle class
 */
public class Example1 {
    public static void main(String[] args) {
        final List<Integer> numbers =
                Arrays.asList(3, 6, 2, 5, 2, 8, 9, 5, 4, 3, 2, 1, 5, 7, 4, 5, 3);
        //For each of these operations, if the result is a stream
        //do a forEach() print to verify your result

        //Filter all the odd numbers
        //Count the odd numbers
        //Create a List of all the odd numbers

        //Sort the even numbers
        //Create a List of the four smallest even numbers
        //Create a List minus the four smallest even numbers

        //Find the max and min number that is divisible by 3
        //Find the product of all the numbers divisible by 3
        //Sum up all the numbers divisible by 3

        //Create a stream of Circles using the first four numbers (Hint use map())
        //Create a private static method that takes in two Circles as arguments and
        //--returns 0 if they have the same radius
        //--returns a positive value if the first's radius is greater than the second's radius
        //--returns a negative value if the first's radius is less than the second's radius
        //Using this compare sort your stream of Circles
        //Create a new List of the areas of your Circles (Hint use map())
    }
}
