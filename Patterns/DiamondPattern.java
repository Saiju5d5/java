import java.util.Scanner;
public class DiamondPattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = s.nextInt();
        //for upper part
        for(int i=1;i<=rows;i++){
            //for space
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            //for star 
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for lower part
        for(int i=rows-1;i>=1;i--){
            //for space
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
