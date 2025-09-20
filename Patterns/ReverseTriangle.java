import java.util.*;
public class ReverseTriangle {
    
    public static void main(String Args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
                s.close();
            }
        }
    }
}
