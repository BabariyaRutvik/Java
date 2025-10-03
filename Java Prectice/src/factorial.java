// Factorial of a number
import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int number=scanner.nextInt();

        long fact=Factorial(number);

        System.out.println("Factorial is: "+fact);


    }
    public static long Factorial(int number){

        if (number<2){
            return  1;
        }
        long fact=1;
        int i=2;
        while (i<=number){
            fact=fact*i;
            i++;

        }
        return  fact;
    }
}
