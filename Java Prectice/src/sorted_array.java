// Create a program to check the given array is Sorted or not.
public class sorted_array
{
    public static void main(String[] args) {

        System.out.println("Welcome to the Array Sorting\n\n");

        int [] arrayName=ArrayUtility.Arrayinput();

        boolean isInc=isIncreasing(arrayName);
        boolean isDes=isDecreasing(arrayName);

        if (isInc || isDes){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }

    }
    public static boolean isDecreasing(int [] arrayNum){
        int i=1;
        while (i < arrayNum.length){
            if (arrayNum[i] >arrayNum[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int [] arrayNum){
        int i=1;

        while (i < arrayNum.length){
            if (arrayNum[i] < arrayNum[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
