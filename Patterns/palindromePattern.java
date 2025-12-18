import java.util.Scanner;
public class palindromePattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++){
            //for space
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            //for 1st part
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
