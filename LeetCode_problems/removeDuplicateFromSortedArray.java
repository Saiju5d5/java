public class removeDuplicateFromSortedArray{
    public static int removeDuplicate(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int[] num = {1,2,2,3,3,4};
        int result = removeDuplicate(num);
        System.out.println("New Length : "+result);
        System.out.print("Array after removing the duplicates : ");
        for(int k=0;k<result;k++){
            System.out.print(num[k]+" ");
        }
    } 
}
