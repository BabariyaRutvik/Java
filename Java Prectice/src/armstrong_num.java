import java.util.Scanner;
// check a program to number is Armstrong number or not
public class armstrong_num
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Armstrong Number\n");

        System.out.println("Enter Any Number: ");
        int number=scanner.nextInt();

        boolean isArmstrong=isArmstrongNum(number);

        if (isArmstrong){
            System.out.println(number+ " Armstrong Number");
        }
        else {
            System.out.println(number+ " Not an Armstrong Number");
        }

    }
    public static boolean isArmstrongNum(int num){
        int No_digits=No_Of_Digits(num);
        int num1=num;
        int finalNumber=0;
        while (num>0){
            int l_digits = num % 10;
            num= num / 10;
            finalNumber= finalNumber + Pow(l_digits,No_digits);
        }
        return  finalNumber==num1;

    }
    public static int Pow(int a, int b){
        int result=1;
        int i=0;

        while (i<b){
            result= result * a;
            i++;
        }
        return  result;

    }
    public static int No_Of_Digits(int num){
        int digits=0;
        while (num>0){
            digits++;
            int i=0;
            num=num/10;

        }
        return  digits;

    }
}
