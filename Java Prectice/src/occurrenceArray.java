import java.util.Scanner;

// create a program to find number of occurrences of an elements in an array
public class occurrenceArray
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Occurrence\n");

        Scanner sc=new Scanner(System.in);

        int[] numArray=ArrayUtility.Arrayinput();

        System.out.print("Enter a Any Number You Want to Find: ");
        int num=sc.nextInt();

        int occurrences=NoOccurrences(numArray,num);

        System.out.println("Your Elements Was found " + occurrences + " time in the Array");

    }

    public static int NoOccurrences(int[] arrayNum, int num){
        int occrrences=0;
        int i=0;
        while (i<arrayNum.length){
            if (arrayNum[i]==num){
                occrrences++;
            }
            i++;
        }
        return occrrences;
    }
}
