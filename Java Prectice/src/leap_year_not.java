import java.util.Scanner;

public class leap_year_not
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int year;

        System.out.print("Enter Any Year: ");
        year=sc.nextInt();

        if (year%400==0){
            System.out.println(+year+ " is Leap Year");
        } else if (year%100==0) {
            System.out.println(+year+ " is Not a Leap Year");
        }
        else if (year%4==0){
            System.out.println(+year+" is Leap Year");
        }
        else {
            System.out.println(+year+ " is Not a Leap Year");
        }
    }
}
