import java.util.Scanner;

/**
 * Test harness class to verify the functionality of SafeInput validation methods.
 */
public class DevTest {
    public static void main(String[] args) {
        // Instantiate a single scanner shared across calls
        Scanner in = new Scanner(System.in);

        // Test Requirement 3: prettyHeader
        SafeInput.prettyHeader("MODULE 8 METHODS");
        System.out.println(); // Blank line for readability

        // Test Requirement 1: getNonZeroLenString
        System.out.println("--- Testing getNonZeroLenString ---");
        String testString = SafeInput.getNonZeroLenString(in, "Enter your favorite book title");
        System.out.println("\n[SUCCESS] Returned String value saved: \"" + testString + "\"\n");

        // Test Requirement 2: getInt
        System.out.println("--- Testing getInt ---");
        int testInt = SafeInput.getInt(in, "Enter your favorite lucky number");
        System.out.println("\n[SUCCESS] Returned Integer value saved: " + testInt + "\n");

        // Closing message to show the end of the test harness
        System.out.println("All testing blocks completed successfully.");
        in.close();
    }
}
