import java.util.Scanner;

public class faces {
    public static void main(String args[]) {
        System.out.print("Enter the value of n :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 1:
                n = 7 - n;
                System.out.println(n);
                break;
            case 2:
                n = 7 - n;
                System.out.println(n);
                break;
            case 3:
                n = 7 - n;
                System.out.println(n);
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}