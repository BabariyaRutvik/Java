import java.util.Scanner;

public class Array_searching
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [] arr_s={3,6,9,8,90,12,56,89,87,10};

        System.out.println("Welcome to the Array Searching\n");

        System.out.print("Enter A Number You want to Search: ");
        int num=input.nextInt();

        boolean isFound=isFound(arr_s,num);

        if (isFound){
            System.out.println("Your Number is Found");
        }
        else {
            System.out.println("Your Number is Not Found");
        }


    }
    public static boolean isFound(int arr[], int num){
        int index=0;
        while (index<arr.length){
            if (arr[index]==num){
                return  true;
            }
            index++;
        }
        return false;
    }
}
