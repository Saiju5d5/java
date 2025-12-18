import java.util.Scanner;

class ExceptionHandling1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer value of x : ");
        int x = s.nextInt();
        System.out.print("Enter the integer value of y : ");
        int y = s.nextInt();
        System.out.println("Exception Handling in java");
        String name = null;
        try {
            System.out.print(name.length());
            System.out.println(x / y);
            System.out.println("NO exception");
            s.close();
        } catch (ArithmeticException a) {
            // a.printStackTrace();
             System.out.println(a);
            System.out.println("can this block execute?");
        }
        catch (Exception e) {
             //e.printStackTrace();
             System.out.println(e);
            System.out.println("can this block execute?");
        }
        System.out.println(x + y);
    }
}