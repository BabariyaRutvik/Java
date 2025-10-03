import java.util.Scanner;

// create a program to varify a number is Palindrom or Not.
public class palindrome_num
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Number\n");

        System.out.print("Enter Any Number: ");
        int number=sc.nextInt();

        boolean ispalindrom=isPalindrome(number);

        if (ispalindrom){
            System.out.println( number+ " Palindrome Number");
        }
        else {
            System.out.println(number + " Not Palindrome");
        }


    }
    public static boolean isPalindrome(int num){
        int reverse=Reverse(num);

        return num==reverse;

    }
    public  static int Reverse(int num){
        int num1=0;
        while (num>0){
            int digits = num % 10;
            num1 = num1 * 10 + digits;
            num = num / 10;
        }
        return  num1;

    }
}
