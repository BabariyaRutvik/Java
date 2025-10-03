import java.util.Scanner;

// Create a program, to return a new Array deleting a specific Elements.
public class delete_array
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Deletion \n");

        Scanner scanner=new Scanner(System.in);

        int [] arrayName=ArrayUtility.Arrayinput();

        System.out.println("Enter the Number You want to Delete: ");
        int num= scanner.nextInt();

        int[] numdelete=DeleteNumber(arrayName,num);

        System.out.println("Here is Your New Array");
        ArrayUtility.DisplayArray(numdelete);
    }
    public static int[] DeleteNumber(int [] arrayNum, int num){
        int occurrences= occurrenceArray.NoOccurrences(arrayNum, num);

        if (occurrences==0){
            return arrayNum;
        }
        int size=arrayNum.length-occurrences;
        int [] newArray=new int[size];


        int i=0;
        int j=0;

        while (i < arrayNum.length){
            if (arrayNum[i] != num){
                newArray[j] = arrayNum[i];
                j++;
            }
            i++;
        }
        return newArray;





    }
}
