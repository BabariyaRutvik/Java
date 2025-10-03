import java.util.Scanner;

public class bitwise_op
{
    public static void main(String[] args) {

        int a,b;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        a=sc.nextInt();

//        System.out.println("Enter 2nd Number: ");
//        b=sc.nextInt();

        // Bitwise AND
//        int result=a & b;

//        System.out.println("Result: "+result);

        // Bitwise OR
//        result=a|b;
//

        // Bitwise XOR
//        result=a^b;
//        System.out.println("Result:"+result);

        // Bitwise Complement
         int result=~a;

       // Left Shift
         result=a<<2;


         // Right Shift
        result=a>>1;
        System.out.println("Result: "+result);

    }
}
