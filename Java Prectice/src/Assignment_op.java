import java.util.Scanner;

public class Assignment_op
{
    public static void main(String[] args) {
        int num1,num2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1sst Number: ");
        num1= sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        num2= sc.nextInt();

        // simple Assignment

        int result=num1;
        System.out.println("= : result = " + result);

        // Addition Assignment
        result+=num2;
        System.out.println("+= : result = " + result);

        // Substraction Assignment
        result-=num2;
        System.out.println("-= : result = " + result);

        // multiplication Assignment
        result*=num2;
        System.out.println("*= : result = " + result);

        // division Assignment
        if (num2 != 0) {
            result /= num2;
            System.out.println("/= : result = " + result);
        } else {
            System.out.println("/= : Cannot divide by zero");
        }

        // %= (Modulus Assignment)
        if (num2 != 0) {
            result %= num2;
            System.out.println("%= : result = " + result);
        } else {
            System.out.println("%= : Cannot modulus by zero");
        }







    }
}
