import java.util.Scanner;
public class TwoSumProblem {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        //for array input
        for(int i=0;i<n;i++){
            System.out.print("Enter the arr["+i+"] : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = s.nextInt();
        boolean result =false;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    result = true;
                    System.out.println("["+i+","+j+"]->("+arr[i]+","+arr[j]+")");
                }
            }
        }
        if(!result){
            System.out.println("No pair found");
        }
    }
}
