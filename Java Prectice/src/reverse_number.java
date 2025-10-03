import java.util.Scanner;

// create a program to make a reverse the number
public class reverse_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number;

        System.out.println("Welcome the Reverse Number\n");

        System.out.print("Enter Any Number: ");
        number=sc.nextInt();

        int reverse=ReverseNum(number);

        System.out.println("Reverse Number is: "+reverse);


    }
    public static int ReverseNum(int number){

        int reverse=0;
        int digits;

        while (number>0){
            digits=number%10;
            reverse=reverse*10+digits;
            number=number/10;

        }
        return  reverse;

    }
}
