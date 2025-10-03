import java.util.Scanner;

public class Arithmetic_op
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;

        System.out.print("Enter 1st Number: ");
        a= sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        b= sc.nextInt();


        // Addition

        System.out.println("Addition: "+(a+b));
        // Substraction

        System.out.println("Substraction: "+(a-b));
        //Multiplication

        System.out.println("Multiplication: "+(a*b));
        // Division

        if (b!=0){
            System.out.println("Division: "+(a/b));
        }
        else {
            System.out.println("Cannot divide by zero:");
        }

        // Modulos
        if (b!=0){
            System.out.println("Modulos: "+(a%b));
        }
        else {
            System.out.println("Cannot divided by zero");
        }

    }
}
