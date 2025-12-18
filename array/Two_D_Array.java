import java.util.Scanner;
public class Two_D_Array {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row of array : ");
        int row = s.nextInt();
        System.out.print("Enter the column of array : ");
        int col = s.nextInt();
        int[] arr[] = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter arr["+i+"]["+j+"] element : ");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
