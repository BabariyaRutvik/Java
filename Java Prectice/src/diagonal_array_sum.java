// Create a Program to Find the Sum of two Diagonal Elements in an array
public class diagonal_array_sum
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Diagonal Sum of 2D Array\n");

        int[][] arrayName=ArrayUtility.input2dArray();
        long sum= SumOfDiagonal(arrayName);

        System.out.print("Sum of Diagonal is: " +sum);
    }
    public static long SumOfDiagonal(int[][] arrayNum){
        long leftSum=SumOfLeftDiagonal(arrayNum);
        long rightSum=SumOfRightDiagonal(arrayNum);
        long sum=leftSum+rightSum;

        if (arrayNum.length % 2 !=0){
            int index=arrayNum.length/2;
            sum -= arrayNum[index][index];
        }
        return sum;
    }

    public static long SumOfLeftDiagonal(int[][] arrayNum){
        long sum=0;
        int i=0;
        while (i < arrayNum.length){
            sum += arrayNum[i][i];
            i++;
        }
        return sum;
    }
    public static long SumOfRightDiagonal(int[][] arrayNum){
        long sum=0;
        int i=0;
        while (i < arrayNum.length){
            int col= arrayNum.length - 1- i;
            sum += arrayNum[i][col];
            i++;
        }
        return sum;
    }
}
