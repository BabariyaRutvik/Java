// create a program to make reverse an Array
public class reverse_array
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse Array");
        int [] arrayName=ArrayUtility.Arrayinput();

        reverse(arrayName);
        System.out.println("Reversed Array is: ");
        ArrayUtility.DisplayArray(arrayName);

    }
    public static void  reverse(int [] arrayNum){
        int i=0;
        while (i < arrayNum.length/2){
            int swap=arrayNum[i];
            arrayNum[i] =arrayNum[(arrayNum.length-1)-i];
            arrayNum[(arrayNum.length-1)-i] = swap;
            i++;
        }
    }
}
