import java.util.Scanner;

public class ValidInput {
    // helper method ValidDouble - validates user input for a valid double
    public static double ValidDouble(Scanner scanner, String prompt, String error) {
        String numStr; // userinput
        double validNum;

        System.out.println(prompt);
        while (true) {
            numStr = scanner.next();
            try {
                validNum = Double.parseDouble(numStr);
                break;
            } catch (Exception e) {
                System.out.println(error);
                continue;
            }
        }

        return validNum;
    }
         // helper method ValidDouble - validates user input for a valid integer
    public static double ValidInteger(Scanner scanner, String prompt, String error) {
        String numStr; // userinput
        int validNum;

        System.out.println(prompt);
        while (true) {
            numStr = scanner.next();
            try {
                validNum = Integer.parseInt(numStr);
                break;
            } catch (Exception e) {
                System.out.println(error);
                continue;
            }
        }

        return validNum;
    }
}
