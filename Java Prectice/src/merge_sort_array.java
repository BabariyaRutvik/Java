// Create a Program to Merge a two Sorted Array
public class merge_sort_array
{
    public static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Arrays");

        int [] array1=ArrayUtility.Arrayinput();
        int [] array2=ArrayUtility.Arrayinput();
        int[] mergedArray=Merge(array1,array2);

        System.out.println("Merged Array is: ");
        ArrayUtility.DisplayArray(mergedArray);

    }
    public static int[] Merge(int[] arr1, int[] arr2){
        int newsize= arr1.length +arr2.length;
        int[] newarr=new int[newsize];

        int i=0,j=0,k=0;

        while (i < arr1.length || j < arr2.length){
            if (j== arr1.length || (i < arr1.length && arr1[i] < arr2[j])){
                newarr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                newarr[k]=arr2[j];
                k++;
                j++;

            }
        }

        return newarr;
    }
}
