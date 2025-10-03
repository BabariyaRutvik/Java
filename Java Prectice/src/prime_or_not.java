
// create a program to find a number is prime or not.
import java.util.Scanner;

public class prime_or_not
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Prime Number\n");

        System.out.println("Enter Any Number: ");
        int number=sc.nextInt();

        boolean isPrime=PrimeNumber(number);

        if (isPrime){
            System.out.println(number+ " Prime Number");
        }
        else {
            System.out.println(number+ " Not Prime Number");
        }



    }
    public static boolean PrimeNumber(int number){
        int i=2;
        while (i<number){
            if (number%i==0){
                return false;
            }
            i++;

        }
        return true;
    }
}
