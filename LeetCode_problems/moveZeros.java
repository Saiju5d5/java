import java.util.Scanner;
public class moveZeros {
    public static int[] movezeros(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count < nums.length){
            nums[count++]=0;
        }
        return nums;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of nums : ");
        int size = s.nextInt();

        int[] nums = new int[size];
        for(int i=0;i<nums.length;i++){
            System.out.print("nums["+i+"] : ");
            nums[i] = s.nextInt();
        }
        movezeros(nums);
        for(int n: nums){
            System.out.print(n+" ");
        }
    }
}
