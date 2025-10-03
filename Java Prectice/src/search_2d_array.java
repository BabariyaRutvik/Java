import java.util.Scanner;

// Create a Program to Search 2-D Array
public class search_2d_array
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Welcome to the Searching 2D Array");

        int [][] arrayName=ArrayUtility.input2dArray();

        System.out.print("Enter Number you want to Search: ");
        int num=sc.nextInt();

        boolean isFound=Search(arrayName,num);

        if (isFound){
            System.out.println("Your Number in An Array");
        }
        else {
            System.out.println("Your Number Not in An Array");
        }

    }
    public static boolean Search(int[][] arrayNum, int num){
        int i=0;
         while (i < arrayNum.length){
             int j=0;
             while (j < arrayNum[i].length){

                 if (arrayNum[i][j] == num){
                     return true;

                 }
                 j++;
             }
             i++;
         }
        return false;
    }
}
