package Maximum_Subarray_53;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEnd = nums[0];

        for(int i=1; i<nums.length; ++i){
            maxEnd = Math.max(maxEnd+nums[i],nums[i]);
            maxSoFar = Math.max(maxEnd,maxSoFar);
        }
        return maxSoFar;
    }
}
