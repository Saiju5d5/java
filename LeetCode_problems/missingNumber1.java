public class missingNumber1 {
    public static int missingNumber(int[] nums) {
        int xor = nums.length; 
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }
     public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1}; 
        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}
