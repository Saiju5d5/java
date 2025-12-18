import java.util.*;
public class intersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }

        for(int n : nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }
        int[] result = new int[set2.size()];
        int i=0;
        for(int n : set2){
            result[i++]=n;
        }
        return result;
    }
    public static void main(String args[]){
        int nums1[] = {1,2,2,1,4};
        int nums2[] = {2,1,3,4,};
        int[] answer = intersection(nums1,nums2);
        for(int k : answer){
            System.out.print(k+" ");
        }
    }
}