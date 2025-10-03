import java.util.Scanner;

public class ArraySumAverage
{
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Welcome to the Sum And Average of An Array\n");
//
//        System.out.print("Enter an Array Elements: ");
//        int size = sc.nextInt();
//
//        int num[]= new int[size];
//
//        int i=0;
//
//        while (i<size){
//            System.out.print("Please Enter Array Elements No "+(i+1)+ ":");
//            i++;
//
//        }

        int[] numArray=ArrayUtility.Arrayinput();

        long sum=Sum(numArray);
        double average=Average(numArray);

        System.out.println("Sum Of Number is: \n"+sum);

        System.out.println("Average of Number is: "+average);

    }
    public static long Sum(int[] arrayNum){
        long sum=0;
        int i=0;

        while (i < arrayNum .length){
            sum=sum+arrayNum[i];
            i++;
        }


        return sum;
    }
    public static double Average(int[] arrayNum){
        double sum=Sum(arrayNum);
        return (sum/arrayNum.length);
    }
}
