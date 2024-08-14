import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnit Converter");
            System.out.println("Choose a conversion type:");
            System.out.println("1. Meters to Feet");
            System.out.println("2. Kilograms to Pounds");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            double result = 0;
            switch (choice) {
                case 1:
                    // Meters to Feet
                    System.out.println("Enter meters: ");
                    double meters = scanner.nextDouble();
                    result = metersToFeet(meters);
                    System.out.println(meters + " meters is " + result + " feet.");
                    break;
                case 2:
                    // Kilograms to Pounds
                    System.out.println("Enter kilograms: ");
                    double kilograms = scanner.nextDouble();
                    result = kgToPounds(kilograms);
                    System.out.println(kilograms + " kg is " + result + " pounds.");
                    break;
                case 3:
                    // Celsius to Fahrenheit
                    System.out.println("Enter Celsius: ");
                    double celsius = scanner.nextDouble();
                    result = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + "°C is " + result + "°F.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Conversion methods
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
