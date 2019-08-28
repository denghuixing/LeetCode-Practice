package Sortest_Unsorted_Continuous_Subarray_581;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{2,6,4,8,10,9,15};
        int[] arr2 = new int[]{1};
        int res = s.findUnsortedSubarray(arr2);
        System.out.println(res);
    }

    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1) return 0;
        int[] tmpArr = nums.clone();
        Arrays.sort(tmpArr);
//        System.out.println(Arrays.toString(tmpArr));
//        System.out.println(Arrays.toString(nums));
        int start = nums.length-1;
        int end = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != tmpArr[i]){
                start = i;
                break;
            }
        }
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] != tmpArr[i]){
                end = i;
                break;
            }
        }
        return end - start + 1 > 0 ? end - start + 1 : 0;
    }
}
