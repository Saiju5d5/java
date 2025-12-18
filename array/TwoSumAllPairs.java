public class TwoSumAllPairs {
    public static void findAllPairs(int[] nums, int target) {
        System.out.println("All pairs whose sum is " + target + ":");

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: (" + i + ", " + j + ") → Values: (" + nums[i] + ", " + nums[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No such pairs found.");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 9, 11, 8, 4, 3, 6};
        int target = 11;
        findAllPairs(nums, target);
    }
}
