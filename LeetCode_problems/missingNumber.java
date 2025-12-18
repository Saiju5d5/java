public class missingNumber {

    public static int missingNumber(int[] nums) {
        // Bubble sort
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        // Find first mismatch
        for (int k = 0; k < nums.length; k++) {
            if (k != nums[k]) {
                return k;
            }
        }
        // Missing number is the largest (n)
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1}; // example input
        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}
