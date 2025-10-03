import java.util.Scanner;

public class positive_nagative
{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number: ");
        num=sc.nextInt();

        if (num>0){
            System.out.println(+num+" is Positive Number");
        }
        else if (num<0){
            System.out.println(+num+" is Nagative Number");
        }
        else {
            System.out.println(+num+" is Zero");
        }
    }
}
