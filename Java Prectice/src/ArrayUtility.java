import java.util.Scanner;
// create a program to find Sum and Average of All Elements in an Array.
public class ArrayUtility
{
   public static int[] Arrayinput(){
       Scanner sc=new Scanner(System.in);



       System.out.print("Enter an Array Elements: ");
       int size = sc.nextInt();

       int num[]= new int[size];

       int i=0;

       while (i<size){
           System.out.print("Please Enter Array Elements No "+(i+1)+ ":");
           num[i]=sc.nextInt();
           i++;

       }
       return num;
  }
  public static void DisplayArray(int [] arrayNum){
       int i=0;

       while (i < arrayNum.length){
           System.out.print(arrayNum[i] + " ");
           i++;
       }
      System.out.println();
  }
  public static int[][] input2dArray(){
       Scanner input=new Scanner(System.in);

      System.out.print("Enter Number of Row: ");
      int row=input.nextInt();

      System.out.print("Enter Number of Column: ");
      int column=input.nextInt();

      int[][] newArray=new int[row][column];

      int i=0;

      while (i < row){
          int j=0;

          while (j < column){
              System.out.print("Enter Elements Row: " +(i + 1)+ " Column: " + (j + 1)+ ":");
                newArray[i][j]=input.nextInt();
                j++;
          }
          i++;

      }
      return  newArray;
  }
}
