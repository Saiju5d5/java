import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            fact = 1;
            System.out.println(fact);
        }
        while (n > 1) {
            fact = fact * n;
            n--;
            s.close();
        }
        System.out.println(fact);
    }

}
