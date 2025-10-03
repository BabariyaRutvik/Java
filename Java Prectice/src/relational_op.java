import java.util.Scanner;

public class relational_op
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter You age: ");
        int age=sc.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible for Vote!");
        }
        else {
            System.out.println("Not Eligible");
        }

    }
}
