import java.util.Scanner;

public class LoopsPatterns {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter How many rows you want to Enter: ");
        int rows= sc.nextInt();
//        pattern1(rows);

//        pattern2(rows);

        pattern3(rows);


    }

    public static void pattern1(int m_row) {
        int n = 0;
        while (n < m_row) {
            System.out.print("*");

            int i = 0;
            while (i < n) {
                System.out.print(" *");
                i++;
            }

            System.out.println();  // move to next line
            n++;
        }
    }
    public static void pattern2(int m_rows){
        int n=m_rows;
        while (n > 0){
            int i=0;
            while (i < n){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            n--;
        }
    }
    public static void pattern3(int m_rows){
        int rows=m_rows;
        while (rows>0){
            int j=0;
            while (j<rows-1){
                System.out.print("  ");
                j++;

            }
            int i=0;
            while (i < (m_rows-rows+1)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;

        }
    }
}
