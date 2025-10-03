// create a program to find fibonacci series upto certain Numbers
import java.util.Scanner;

public class fibonacci_series
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number;

        System.out.println("Welcome to the Fibonacci Series\n");

        System.out.print("Enter Any Number: ");
        number= sc.nextInt();



        System.out.println("Fibonacci Series is: ");
        Fibonacci(number);

    }
    public static void Fibonacci(int number){
        if (number<0) return;
        System.out.print("0 ");

        if (number==0) return;
        System.out.print("1 ");

        int a=0;
        int b=1;

        while ( a + b <= number){
            int c=a+b;

            System.out.print(c + " ");
            a = b;
            b = c;


        }
    }
}
