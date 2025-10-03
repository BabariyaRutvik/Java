// create a program to find minimum and maximum number of an Array
public class min_max_array
{
    public static void main(String[] args) {

        System.out.println("Wekcome to the Minimum and Maximum Array: ");

        int [] arrayName=ArrayUtility.Arrayinput();

        int max=max(arrayName);
        int min=min(arrayName);

        System.out.println("Maximum of An Array: "+max);
        System.out.println("Minimum of An Array: "+min);

    }
    public static int max(int[] max_num){
        if (max_num.length == 0){
            return Integer.MIN_VALUE;

        }
        int max=max_num[0];
        int i=1;
        while (i < max_num.length){
            if (max < max_num[i]){
                max = max_num[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] min_num){
        int min = Integer.MAX_VALUE;
        int i=0;

        while (i < min_num.length){
            if (min > min_num[i]){
                min = min_num[i];
            }
            i++;
        }
        return min;

    }
}
