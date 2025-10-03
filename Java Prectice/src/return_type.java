import java.util.Scanner;

public class return_type
{
    public static void main(String[] args) {

        int a,b;

        a=readNum()+2;
        b=readNum()+3;

        int sum=a+b;

        System.out.println("Sum of Numbers is: "+sum);
    }
    public static int readNum(){
        int number;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        number=sc.nextInt();

        return  number;

    }
}
