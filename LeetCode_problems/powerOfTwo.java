import java.util.Scanner;
public class powerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n > 0 && (n & (n-1)) == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");    
        int n = s.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }
}