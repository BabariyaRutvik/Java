import java.util.Scanner;

public class while_loops
{
    public static void main(String[] args) {
        int i=1; // intialization

        // while loop
//        while (i<=10){
//            System.out.println(i);
//            i=i+1;
//
//        }
        int j=500;
//        while (j>=200){
//            System.out.println(j);
//            j--;
//
//        }

        Scanner sc=new Scanner(System.in);

        int k=0;
        while (k<5){
            int num=sc.nextInt();
            System.out.println("Number: "+num);
            k++;

        }
    }
}
