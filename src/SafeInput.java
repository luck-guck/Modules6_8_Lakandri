import java.util.Scanner;

public class SafeInput {


    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input = "";
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextLine()) {
                input = pipe.nextLine().trim();
            }
            if (input.length() == 0) {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        } while (input.length() == 0);

        return input;
    }


    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                valid = true;
            } else {
                String trash = pipe.next(); // Consume the invalid input token
                System.out.println("Error: \"" + trash + "\" is not a valid integer. Please try again.");
            }
            if (pipe.hasNextLine()) {
                pipe.nextLine(); // Clear the trailing newline/rest of line buffer
            }
        } while (!valid);

        return value;
    }

    public static void prettyHeader(String msg) {
        final int TOTAL_WIDTH = 60;

        // 1. Top border row
        for (int i = 0; i < TOTAL_WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 2. Middle row calculations
        // Format: *** [spaces] [msg] [spaces] ***
        int sideAsterisks = 3;
        int standardPaddingWidth = TOTAL_WIDTH - (sideAsterisks * 2); // 54 spaces available for msg + padding

        int msgLength = msg.length();
        int totalSpacesNeeded = standardPaddingWidth - msgLength;

        int leftSpaces = totalSpacesNeeded / 2;
        int rightSpaces = totalSpacesNeeded - leftSpaces; // Accounts for odd length strings

        System.out.print("***");
        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // 3. Bottom border row
        for (int i = 0; i < TOTAL_WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

