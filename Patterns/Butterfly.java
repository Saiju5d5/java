import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //for upper part
        for(int i=1;i<=n;i++){
            //star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //star
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
        //for lower part
        for(int i=n-1;i>=1;i--){ //if we take i=n-1 then it print a single line with star only and remainings are with spaces 
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //star
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
