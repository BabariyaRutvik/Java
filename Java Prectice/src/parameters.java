import java.util.Scanner;

public class parameters
{
    public static void main(String[] args) {
        int num1,num2;


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        num1=sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        num2=sc.nextInt();

        Calculator(num1,num2);

    }
    public static int Calculator(int a, int b){
        System.out.println("Addition: "+(a+b));
        System.out.println("Substraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        if (b!=0){
            System.out.println("Division: "+(a/b));
        }
        else {
            System.out.println("Zero are not Divisible");
        }
      return a+b;

    }
}
