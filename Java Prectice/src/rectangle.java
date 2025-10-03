import java.util.Scanner;

public class rectangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double a,b,c,d;

        System.out.println("Enter 1st Side: ");
        a=sc.nextDouble();

        System.out.println("Enter 2nd Side: ");
        b= sc.nextDouble();

        System.out.println("Enter 3rd Side: ");
        c= sc.nextDouble();

        System.out.println("Enter 4th Side:");
        d= sc.nextDouble();


        double perameter=a+b+c+d;

        System.out.println("Parameter of Rectangle is: "+perameter);


    }
}
