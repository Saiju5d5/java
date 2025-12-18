public class mergeTwoSortedArray {
    public static int[] mergeArray(int[] nums1,int m,int[] nums2,int n){
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;

        while (p1>=0 && p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }
            else {
                nums1[p]=nums2[p2];
                p2--;
            }
            p--;
        }
        return nums1;
    }
    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 ={2,5,7};
        int m=3;
        int n=3;
        int[] result = mergeArray(nums1,m,nums2,n);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
