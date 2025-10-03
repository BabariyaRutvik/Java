import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double base,height;

        System.out.println("Enter Base of Triangle: ");
        base= sc.nextDouble();

        System.out.println("Enter Height of Triangle: ");
        height=sc.nextDouble();

//        double area=0.5* base * height;
        double area=(base*height)/2;


        System.out.println("Area of Traingle is: "+area + "Cm");

    }
}
