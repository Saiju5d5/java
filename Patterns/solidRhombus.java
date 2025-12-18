import java.util.Scanner;
public class solidRhombus {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = s.nextInt();
    //int mid = n/2;
    for(int i=0;i<n;i++){
        for(int j=1;j<n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<n;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
} 
