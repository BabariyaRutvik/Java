import java.util.Scanner;

public class sum_of_digits
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Any Number: ");
        int number= scanner.nextInt();

        int sum=SumOfDigits(number);

        System.out.println("Sum Of Digits is: "+sum);

        SumOfDigits(number);

    }
    public static int SumOfDigits(int num){
            int sum=0;
            while (num>0){
                sum=sum+num%10;
                num=num/10;

            }
            return sum;

    }
}
