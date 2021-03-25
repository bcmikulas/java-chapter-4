import java.util.Scanner;

public class Chapter3 {
    // Chapter 3 Milestone 1
    public void Milestone1(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i % num1 == 0 && i != 0) {
                break;
            }
        }
    }

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

        System.out.println("Enter some numbers:");
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

    public void Milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    } // end Mileston3

}