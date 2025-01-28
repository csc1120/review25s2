package wk1;

import java.util.Scanner;

public class ExceptionExamples1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        String input;
        do {
            System.out.println("Enter a value from 1 to 10");
            input = scanner.next();
            try {
                int value = Integer.parseInt(input);
                if (value < 1 || value > 11) {
                    throw new IllegalArgumentException("Bad input " + value);
                }
                System.out.println("The value is " + value);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Input needs to be an int");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Input was not in the right range");
                System.out.println(e.getMessage());
            }
        }while (!validInput);
        System.out.println(input);
    }
}
