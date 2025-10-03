// Create a program to check the Array is Palindrome or not
public class palindrome_array
{
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Array");

        int [] arrayName=ArrayUtility.Arrayinput();

        boolean is_Palin=isPalindrome(arrayName);

        if (is_Palin){
            System.out.println("Array is Palindrome");
        }
        else {
            System.out.println("Array is Not Palindrome");
        }


    }
    public static boolean isPalindrome(int [] numArray){
        int i=0;

        while (i < numArray.length/2){
            if (numArray[i] != numArray[numArray.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
