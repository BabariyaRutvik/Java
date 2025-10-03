import java.util.Scanner;

public class max_num
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int num1,num2,num3;
        int max;


        System.out.print("Enter `1st Number: ");
        num1=scanner.nextInt();

        System.out.print("Enter 2nd Number: ");
        num2=scanner.nextInt();

        System.out.print("Enter 3rd Number: ");
        num3= scanner.nextInt();

//        if (num1>num2){
//            if (num1>num3){
//                System.out.println("\n\nLargest Number is: "+num1);
//            }
//            else {
//                System.out.println("\n\nLargest Number is: "+num3);
//            }
//
//        }
//        else {
//            if (num2>num3){
//                System.out.println("\n\nLargest Number is: "+num2);
//            }
//            else {
//                System.out.println("\n\nLargest Number is: "+num3);
//            }
//        }

        if (num1 >= num2 && num1>=num3){
            System.out.println("\n\n Largest Number is: "+num1);
        } else if (num2>=num3) {
            System.out.println("\n\n Largest Number is: "+num2);
        }
        else {
            System.out.println("\n\n Largest Number is: "+num3);
        }
    }
}
