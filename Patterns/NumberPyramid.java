import java.util.Scanner;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++){
            //for space
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //for pattern
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
