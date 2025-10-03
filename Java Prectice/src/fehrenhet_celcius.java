import java.util.Scanner;

public class fehrenhet_celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion: ");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit: ");
            float fah = sc.nextFloat();
            float ce = (fah - 32) * 5 / 9;
            System.out.println("Temperature: " + ce + " °C");
        }
        else if (choice == 2) {
            System.out.println("Enter temperature in Celsius: ");
            float ce = sc.nextFloat();
            float fah = (ce * 9 / 5) + 32;
            System.out.println("Temperature: " + fah + " °F");
        }
        else {
            System.out.println("Invalid Choice...");
        }


    }
}
