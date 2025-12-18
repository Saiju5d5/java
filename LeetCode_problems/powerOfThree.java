import java.util.Scanner;
public class powerOfThree {
    // Non static method
    public boolean isPowerOfThree(int n) {
        if( n > 0 && 1162261467 % n == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        powerOfThree ob = new powerOfThree(); // create object to call the method
        boolean result = ob.isPowerOfThree(n); //calling method
        System.out.println(result);
    }
}
