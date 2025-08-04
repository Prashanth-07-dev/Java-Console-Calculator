package firstproject;

public class consolecalculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static void showMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean running = true;
      System.out.println("=== Java Console Calculator ===");

        while (running) {
            showMenu();
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Thank you for using the calculator!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            if (choice == 4 && num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                continue;
            }

            double result = 0;
            switch (choice) {
                case 1: result = add(num1, num2); break;
                case 2: result = subtract(num1, num2); break;
                case 3: result = multiply(num1, num2); break;
                case 4: result = divide(num1, num2); break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
