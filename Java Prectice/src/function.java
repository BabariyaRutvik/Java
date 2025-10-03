public class function
{
    public static void main(String[] args) {
        greeting();
         first_stpatterntn();
//        second();
//        third();

    }

    public static void greeting(){
        System.out.println("Hello Welcome to the Java Language Function Part!");
    }
    public static void first_stpatterntn(){
//        System.out.println(" *");
//        System.out.println(" * *");
//        System.out.println(" * * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * * ");
        int n = 1;
        while (n <= 5) {
            int i = 0;
            while (i < n) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            n++;
        }







//        System.out.println("       *");
//        System.out.println("     * *");
//        System.out.println("   * * *");
//        System.out.println(" * * * *");
//        System.out.println("* * * * *");
    }
    public static void second(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void third(){
        System.out.println("       *");
        System.out.println("     * *");
        System.out.println("   * * *");
        System.out.println(" * * * *");
        System.out.println("* * * * *");
    }
}
