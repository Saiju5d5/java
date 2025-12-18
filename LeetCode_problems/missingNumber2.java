public class missingNumber2 {
    public static int missingnumber(int[] nums){
       int n=nums.length+1;
       int sum =0;
       int totalsum = n*(n+1)/2; 
       for(int i=0;i<n-1;i++){
        sum += nums[i];
        
       }
       return totalsum-sum;
    }
    public static void main(String args[]){
        int[] nums={1,3,5,4,2,7,8,6};
        int result = missingnumber(nums);
        System.out.println(result);
    }
}
