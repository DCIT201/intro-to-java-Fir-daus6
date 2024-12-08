import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose from the following options: ");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");

        int choice = scanner.nextInt();
        System.out.printf("%s",choice);

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit");
            double fahrenheit = scanner.nextDouble();
            double celcius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.2f",celcius);

        }else if (choice == 2) {
            System.out.println("Enter temperature in Celsius");
            double celcius = scanner.nextDouble();
            double fahrenheit = (celcius *9 / 5) + 32;
            System.out.printf("%.2f",fahrenheit);
        } else {
            System.out.println("Invalid Input");
        }
        scanner.close();

    }
}



