import java.util.Scanner;
public class Arrowhead_Right {
    public static void main(String atgs[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();
        //for upper part
        for(int i=1;i<=n;i++){
            //for space
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //for for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for(int i=n-1;i>=1;i--){
            //for space
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //for for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            s.close();
        }
    }
}
