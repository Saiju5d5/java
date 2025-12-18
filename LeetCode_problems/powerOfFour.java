import java.util.Scanner;
public class powerOfFour {
    //static method
    public static boolean isPowerOfFour(int n) {
         return n > 0
         && (n & (n - 1)) == 0 
         && ((n & 0x55555555) != 0);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        boolean result = isPowerOfFour(n); //calling method directly without creating object
        System.out.println(result);
    }
}
