import java.util.Scanner;

class ExceptionHandling {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer value of x : ");
        int x = s.nextInt();
        System.out.print("Enter the integer value of y : ");
        int y = s.nextInt();
        System.out.println("Exception Handling in java");
        try {
            System.out.println(x / y);
            System.out.println("NO exception");
            s.close();
        } catch (Exception a) {
            // a.printStackTrace();
            // System.out.println(a);
            System.out.println("can this block execute?");
        }
        System.out.println(x + y);
    }
}