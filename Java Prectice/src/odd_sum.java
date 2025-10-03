// Sum all odd numbers from 1 to N
import java.util.Scanner;

public class odd_sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number=sc.nextInt();

        int sum=OddNumber(number);
        System.out.println("Odd Sum " + number + " is: " + sum);
    }
    public static int OddNumber(int number){
        int sum=0;
        int i=1;  // Starting from 1
        while (i <= number) {

            sum=sum+i;
            i=i+2;

        }

        return sum;
    }
}
