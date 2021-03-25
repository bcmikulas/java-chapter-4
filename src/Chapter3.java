import java.util.Scanner;

public class Chapter3 {
    // Chapter 3 Milestone 1
    public void milestone1(int num1, int num2) {
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
    public void milestone2(Scanner scanner) {
        // ask the user to enter a bunch of numbers
        // loop until a negative number
        // print average of number
        // don't close the scanner
    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }

}