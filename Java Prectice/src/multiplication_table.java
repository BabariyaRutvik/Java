// Write a program to print a multiplication table
import java.util.Scanner;

public class multiplication_table
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("\nWelcome to the Multiplication Table\n");

        System.out.print("Enter Any Number: ");
        int num= scanner.nextInt();

        multiplication(num);

    }
    public static void multiplication(int number){
        int i=1;

        while (i<=10){
            System.out.println( number+ " X " + i + " = " + (number * i) );
            i++;

        }
    }
}
