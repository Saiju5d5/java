import java.util.HashMap;
public class TwoSum {
    public static int[] Twosum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[] nums = {2,7,0,11,8,4};
        int target = 12;
        int[] result = Twosum(nums,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
    
}
