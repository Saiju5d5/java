import java.util.Arrays;
//import java .util.*;
public class SecondLargestNumber {
    
    static int getSecondlargest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={70,45,67,34,890,10,90};
        System.out.println(getSecondlargest(arr));
    }
}
