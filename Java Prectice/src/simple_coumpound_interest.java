import java.util.Scanner;

public class simple_coumpound_interest
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double p,r,t,si;

        System.out.println("Enter the Principles Amount: ");
        p= sc.nextDouble();

        System.out.println("Enter the Rate of interest: ");
        r=sc.nextDouble();

        System.out.println("Enter the Time Duration: ");
        t=sc.nextDouble();

        si=(p*r*t)/100;

        System.out.println("Simple interest: "+si);


        double ci=p*(Math.pow((1+r/100),t))-p;

        System.out.println("Compound Interest is: "+ci);



    }
}
