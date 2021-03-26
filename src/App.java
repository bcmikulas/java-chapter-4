import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Chapter2 {
    // void milestone1(int num) {
    void milestone1(Scanner scanner) {
        System.out.println("Enter a whole number to find out if it is odd or even:");
        int num = ValidInput.ValidInteger(scanner, "Number: ", "Invalid entry - please enter a whole number.");
        // int num2_1 = scanner.nextInt();

        System.out.print("The number " + num + " is ");
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Chapter 2 Milestone 2 method
    void milestone2(Scanner scanner) {

        System.out.println("Returns the \'int\' portion of given number and the 1st 2 decimal positions.");
        System.out.println();
        double num1 = ValidInput.ValidDouble(scanner, "Please enter a decimal number:",
                "Invalid entry - please enter a number.");

        System.out.println("'int' - " + (int) num1);
        System.out.println("'dec' - " + (int) ((num1 - (int) num1) * 100));
    }

    // Chapter 2 Milestone 2a - BigDecimal method
    void milestone2a(Scanner scanner) {
        System.out.println("Returns the \'int\' portion of given number and the 1st 2 decimal positions.");
        System.out.println("Please input a decimal number:");
        BigDecimal num1 = scanner.nextBigDecimal();
        BigDecimal num2;
        BigDecimal num3;

        // show the integer portion of number
        System.out.println("'int' - " + num1.intValue());
        // show only the 1st 2 decimal positions
        // move decimal point 2 to the right and remove the rest of the decimals
        num2 = num1.movePointRight(2).setScale(0, RoundingMode.DOWN);
        // remove all decimals then move decimal point 2 to the right - makes 2 digits
        // on leftside of decimal 0s
        num3 = num1.setScale(0, RoundingMode.DOWN).movePointRight(2);
        System.out.println("'dec' - " + num2.subtract(num3));
    }

    // Chapter 2 Milestone 3 method
    void milestone3() {
        String stringOfPrimes = "2 ";
        int primesToFind = 100;
        System.out.println("This will find all the prime numbers between 2 and 100.");

        // loop contains 2 through primesToFind -
        for (int y = 3; y <= primesToFind; y++) {
            // loop for the numbers to divide into primesToFind
            for (int x = 2; x < y; x++) {
                if (y % x == 0) {
                    break; // not prime
                }
                if (y == (x + 1) && y % x != 0) {
                    stringOfPrimes += y + " ";
                }
            }
        }
        // System.out.println("Prime numbers between 2 and " + primesToFind + " ");
        System.out.println(stringOfPrimes);

    }

    // Chapter 2 Milestone 4 method
    void milestone4(Scanner scanner) {
        System.out.println("Enter a number of seconds to convert to days, hours, minutes, and seconds.");
        int seconds = ValidInput.ValidInteger(scanner, "Seconds: ", "Invalid entry - please enter a whole number.");

        int secondsInYear = (60 * 60 * 24 * 365);
        int secondsInDay = (60 * 60 * 24);
        int secondsInHour = (60 * 60);

        int years = seconds / secondsInYear;
        int daySeconds = seconds % secondsInYear;
        int days = daySeconds / secondsInDay;
        int hourSeconds = daySeconds % secondsInDay;
        int hours = hourSeconds / secondsInHour;
        int minuteSeconds = hourSeconds % secondsInHour;
        int minutes = minuteSeconds / 60;
        seconds = minuteSeconds % 60;

        // 60 sec 60 min 24 hours 365 days
        System.out.println("Years: " + years);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }

}

public class App {
    // Chapter 1 Milestone 1 method
    static void chapter1milestone1(Scanner scanner) {

        double firstNum, secondNum;

        // prompt the user for two numbers
        System.out.println("Please enter two numbers and the program will return the largest.");
        firstNum = ValidInput.ValidDouble(scanner, "--1st number--", "Invalid Entry - please enter a decimal number.");
        secondNum = ValidInput.ValidDouble(scanner, "--2nd number--", "Invalid Entry - please enter a decimal number.");

        System.out.print("\nThe Largest number is: ");
        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }

    // Chapter 1 Milestone 2 method
    static void chapter1milestone2(Scanner scanner) {
        System.out.println("Please enter two numbers and the program will return the average.");
        double num1 = ValidInput.ValidDouble(scanner, "--1st number--", "Invalid Entry - please enter a number.");
        double num2 = ValidInput.ValidDouble(scanner, "--2nd number--", "Invalid Entry - please enter a number.");

        System.out.println("The average is: " + String.format("%,.2f", (num1 + num2) / 2.0));
    }

    // Chapter 1 Milestone 3 method
    static void chapter1milestone3(Scanner scanner) {
        System.out.println("Enter a value for radius and the program will return circumference and area.");
        double radius = ValidInput.ValidDouble(scanner, "Radius: ", "Invalid entry - please enter a number.");

        double circumference;
        double area;
        double pi = 3.14;

        // calculate circumference and area and print
        circumference = 2 * pi * radius;
        area = pi * radius * radius;
        System.out.println("Circumference: " + String.format("%.2f", circumference));
        System.out.println("Area: " + String.format("%.2f", area));
    }

    public static void main(String[] args) throws Exception {
        // create scanner object for method calls to use
        Scanner scanner = new Scanner(System.in);

        // create Chapter2 object to be used in the Chapter 2 milestones
        Chapter2 chapter2 = new Chapter2();

        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        // Call the Chapter 1 Milestone 1 method
        chapter1milestone1(scanner);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        // Call the Chapter 1 Milestone 2 method
        chapter1milestone2(scanner);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        // Call the Chapter 1 Milestone 3 method
        chapter1milestone3(scanner);

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        // Call the Chapter 2 Milestone 1 method
        chapter2.milestone1(scanner);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        // Call the Chapter 2 Milestone 2 method
        chapter2.milestone2(scanner);

        System.out.println("\n** CHAPTER 2 MILESTONE 2a - Big Decimal Version **");
        // Call the Chapter 2 Milestone 2 method
        chapter2.milestone2a(scanner);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        // Call the Chapter 2 Milestone 3 method
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        // Call the Chapter 2 Milestone 4 method
        chapter2.milestone4(scanner);

        // create Chapter3 object
        Chapter3 chapter3 = new Chapter3();

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        // Call the Chapter 3 Milestone1 method
        chapter3.Milestone1(scanner);

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        // Call the Chapter 3 Milestone2 method
        chapter3.Milestone2(scanner);

        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        // Call the Chapter 3 Milestone3 method
        chapter3.Milestone3(scanner);

        scanner.close();
    }
}
