// create A program to find The Least Common Multiple of (LCM) of two Numbers.

import java.util.Scanner;

public class lcm_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to the LCM\n\n");


        int number1,number2;

        System.out.println("Enter 1st Number: ");
        number1=sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        number2=sc.nextInt();


        int lcm=LCM(number1,number2);

        System.out.println("LCM Of Two Numbers are: "+lcm);



    }
    public static  int LCM(int a, int b){
        int i=1;
        while (true){
            int factor= a * i;
            if ( factor % b == 0){
                return  factor;
            }
            i++;
        }
    }
}
