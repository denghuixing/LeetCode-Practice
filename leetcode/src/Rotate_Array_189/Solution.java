package Rotate_Array_189;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        s.rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public void rotate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
    }
}
