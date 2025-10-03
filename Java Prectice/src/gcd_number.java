// create a program to find Greatest common Divisor (GCD) of two integers.

import java.util.Scanner;

public class gcd_number
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the GCD\n");


        int num1,num2;

        System.out.println("Enter 1st Number: ");
        num1= scanner.nextInt();

        System.out.println("Enter 2nd Number: ");
        num2=scanner.nextInt();

        int gcd=GCD(num1,num2);


        System.out.println("GCD  of Two Numbers are: "+gcd);

    }
    public static int GCD(int a, int b){
            int gcd=1;
            int i=2;

            int least=Least(a,b);

                while (i<=least){
                    if ( a % i == 0 && b % i ==0){
                        gcd=i;
                    }
                    i++;
                }
            return  gcd;
    }
    public  static int Least(int a, int b){
        if (a<b){
            return a;
        }
        else {
            return b;

        }
    }
}
