import java.util.Scanner;

public class product_no
{
    public static void main(String[] args) {
        float a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        a=sc.nextFloat();

        System.out.println("Enter 2nd Number: ");
        b=sc.nextFloat();

        float product=a*b;

        System.out.println("Product of 2 floating Numbers are: "+product);



    }
}
