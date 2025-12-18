import java.util.Scanner;
public class removeElement {
    public static int RemoveElement(int[] nums,int val){
        int i=0;
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[] nums = new int[7];
        for(int i=0;i<nums.length-1;i++){
            System.out.print("Arrary element of nums["+i+"1] :");
            nums[i] = s.nextInt();
        }
        s.close();
        System.out.print("Enter the value of val : ");
        int val = s.nextInt();
        int result = RemoveElement(nums,val);
        System.out.println(result);
        System.out.print("Array after removing the duplicates :");
        for(int k=0;k<result;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
