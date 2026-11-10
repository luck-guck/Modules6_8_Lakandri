import  java.util.Scanner ;
 class PizaaTotalCalculator {
    public static void main(String[] args) {
        // ===== INPUT =====
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pizza price: ");
        // Validate numeric input
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }
        double price = scanner.nextDouble();

        System.out.print("Enter the tax rate: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }
        double taxRate = scanner.nextDouble();

        // ===== PROCESSING =====
        double tax = price * taxRate;
        double total = price + tax;

        // ===== OUTPUT =====
        System.out.printf("Pizza Price: $%.2f%n", price);
        System.out.printf("Tax Amount: $%.2f%n", tax);
        System.out.printf("Final Price: $%.2f%n", total);

        scanner.close();
    }
}
