// Create a program to do Sum and Average of all elements in a 2-d Array.
public class sum_average_2d_array
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average of 2D Array\n");

        int [][] arrayName=ArrayUtility.input2dArray();
        long sum=Sum(arrayName);
        double average=Average(arrayName);

        System.out.println("Sum Of Array is: "+sum);
        System.out.println("Average Of Array is: "+average);
    }
    public static long Sum(int [][] arrayNum){
        long sum=0;
        int i=0;

        while (i < arrayNum.length ){
            int j=0;
            while (j < arrayNum.length){
                sum = sum+arrayNum[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double Average(int [][] arrayNum){
        if (arrayNum.length == 0){
            return 0;
        }
        int rows=arrayNum.length;
        int cols=arrayNum[0].length;
        double size=rows * cols;
        return Sum(arrayNum)/size;
    }
}
