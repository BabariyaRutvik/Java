import java.util.Scanner;

public class logical_op
{
    public static void main(String[] args) {

        System.out.println("Welcome to Ticket Discount Calculator:");

        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter Your Age: ");
        int age=sc.nextInt();

        System.out.println("Are You Female?(true or false)");
        boolean isFemale=sc.nextBoolean();

        if (age<5){
            System.out.println("You got 75% Discount");
        }
        else if (isFemale){
            System.out.println("You got 50% Discount");
        } else if (age>60&& !isFemale) {
            System.out.println("You got 25% Discount");
        }
        else {
            System.out.println("You got no Discount");
        }
    }
}
