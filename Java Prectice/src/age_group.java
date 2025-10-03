import java.util.Scanner;

public class age_group
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age;

        System.out.print("Enter Your Age: ");
        age= sc.nextInt();

        if (age>=65){
            System.out.println("Senior Citizens");
        }
        else if (age>=20){
            System.out.println("Adult");
        }
        else if (age>=13){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}
