public class secondLargestNumber {
    public static int secondlargest(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[smallest]>nums[j]){
                    smallest =j;
                }
            }
            int temp = nums[smallest];
            nums[smallest]=nums[i];
            nums[i]=temp;
        }
        return nums[nums.length-2];
    }
    public static void main(String args[]){
        int[] nums = {7,8,4,1,6,2,3};
        int result = secondlargest(nums);
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println();
        System.out.println(result);
    }
}