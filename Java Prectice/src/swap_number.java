import java.util.Scanner;

public class swap_number
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter 1st Number: ");
        a=sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        b=sc.nextInt();

        System.out.println("Before Swap: "+a);
        System.out.println("Before Swap: "+b);

    // Swapping logic
       c=a;
       a=b;
       b=c;




        System.out.println("\n\nAfter Swap: "+a);
        System.out.println("After Swap: "+b);


    }
}
