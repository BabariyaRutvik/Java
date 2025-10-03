import java.util.Scanner;

public class user_input
{
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc=new Scanner(System.in);


//        System.out.println("Enter your Name:");
//        name=sc.nextLine();
//
//        System.out.println("Good Evening "+name);
//
//        System.out.print("Enter Your Age: ");
//        age=sc.nextInt();
//
//        System.out.print("My Age is :" +age);

//        System.out.println("Enter Your Name: ");
//        name=sc.nextLine();
//
//        System.out.println("Welcome " +name+ " to KG Coding");

        int a,b;

        System.out.print("Enter 1st Number: ");
        a=sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        b=sc.nextInt();

        int sum=a+b;

        System.out.println("Sum is: "+sum);



    }
}
