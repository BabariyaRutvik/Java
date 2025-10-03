import java.util.Scanner;

public class odd_even_bet
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num=sc.nextInt();

        if ((num & 1)==1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }

    }
}
