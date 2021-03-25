import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Chapter3 {
    // Chapter 3 Milestone 1
    // public void Milestone1(int num1, int num2) {
    public void Milestone1(Scanner scanner) {
        String numStr; // user input
        int num1; // user first number
        int num2; // user second number

        // ask user for 2 numbers and vaildate for correct type
        System.out.println("Enter two numbers: ");

        while (true) {
            numStr = scanner.next();
            try {
                num1 = Integer.parseInt(numStr);
                break;
            } catch (Exception e) {
                System.out.println("Invalid number!");
                continue;
            }
        }
        while (true) {
            numStr = scanner.next();
            try {
                num2 = Integer.parseInt(numStr);
                break;
            } catch (Exception e) {
                System.out.println("Invalid number!");
                // Milestone 1
                continue;
            }
        }
        if (num1 > num2) {
            int temp = num1; // used to sort num1 and num2
            num1 = num2;
            num2 = temp;
        }

        // loop through num1 until loop variable is divisible by num1
        for (int i = num1 + 1; i < num2; i++) {
            // print even numbers between num1 and num2 toi the screen
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // check to see if the printed number is divisble by the num1
            // if it is stop
            if (i % num1 == 0 && i != 0) {
                break;
            }
        }
        System.out.println();
    } // end Milestone 1

    // Declare the Chapter 3 Milestone 2 method here
    public void Milestone2(Scanner scanner) {
        // ask the user to enter a bunch of numbers
        // loop until a negative number
        // print average of number
        // don't close the scanner
        int total = 0; // running total of user entered numbers
        int count = 0; // count of numbers entered by user
        double avg; // will hold average of user enter variables
        int num1;
        String numStr; // user input

        System.out.println("This method will average a series of given numbers.");
        System.out.println("Enter several whole numbers (-1 to calculate):");
        do {
            while (true) {
                numStr = scanner.next();
                try {
                    num1 = Integer.parseInt(numStr);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid number.");
                    continue;
                }
            }
            if (num1 >= 0) {
                total += num1;
                count++;
            }
        } while (num1 >= 0);

        if (count > 0) {
            avg = (double) total / count;
            System.out.println("The average is: " + String.format("%,.2f", avg) + "\n");
        }
    } // end Milestone2

    // public void Milestone3(int num1, int num2, int answer) {
    public void Milestone3(Scanner scanner) {
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int userGuess;
        int product;
        String numStr; // user input

        product = randNum1 * randNum2;

        System.out.println(randNum1);
        System.out.println(randNum2);

        System.out.println("What is the product of these two numbers?");
        for (int i = 2; i > -1; i--) {
            // get user input
            while (true) {
                numStr = scanner.next();
                try {
                    userGuess = Integer.parseInt(numStr);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid number.");
                    continue;
                }
            }

            if (product == userGuess) {
                System.out.println("Correct!");
                break;
            }

            // give user 3 attempts to guess correctly
            if (i == 0) { // no attempts remaining
                System.out.println("Incorrect. The answer was " + product + ".");
                break;
            } else if (i == 2) {
                System.out.println("Incorrect. You have " + i + " attempts remaining.");
            } else {
                System.out.println("Incorrect. You have " + i + " attempt remaining.");
            }
        }

        // if (num1 * num2 == answer)
        // System.out.println("Correct!");
        // else
        // System.out.println("Incorrect, the answer was " + (num1 * num2));
    } // end Mileston3

}