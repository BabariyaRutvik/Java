import java.util.Scanner;

public class grade
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int java,kotlin,sql,php,html,css,bootstrap;

        System.out.println("Enter Java Marks: ");
        java=sc.nextInt();

        System.out.println("Enter Kotlin Marks: ");
        kotlin=sc.nextInt();

        System.out.println("Enter SQL  Marks: ");
        sql=sc.nextInt();

        System.out.println("Enter PHP Marks: ");
        php=sc.nextInt();

        System.out.println("Enter HTML Marks: ");
        html=sc.nextInt();


        System.out.println("Enter CSS Marks: ");
        css= sc.nextInt();

        System.out.println("Enter BOOTSTRAP Marks: ");
        bootstrap= sc.nextInt();

        int total=java+kotlin+sql+php+html+css+bootstrap;
        System.out.println("Total: "+total);

        float percentage=total/7;
        System.out.println("Percentage: "+percentage);

        if (percentage>=90){
            System.out.println("Grade: A");
        } else if (percentage>=75) {
            System.out.println("Grade: B");
        }
        else if (percentage>=60){
            System.out.println("Grade: C");
        }
        else if (percentage>=40){
            System.out.println("Grade: E");
        } else {
            System.out.println("Fail Grade: F");
        }

    }
}
