package House_Robber_198;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{2,7,9,3,1};
        System.out.println(s.rob(arr));
    }

    public int rob(int[] nums) {
        if(nums.length < 1) return 0;
        int[] dp = new int[nums.length];
        if(nums.length > 3){
            dp[0] = nums[0];
            dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
            dp[2] = nums[2]+dp[0] > dp[1] ? nums[2]+dp[0] : dp[1];
            for(int i=3; i<nums.length; i++){
                dp[i] = nums[i] + dp[i-2] > dp[i-1] ? nums[i] + dp[i-2] : dp[i-1];
            }
        }
        if(1 == nums.length){
            dp[0] = nums[0];
        }
        if(2 == nums.length){
            dp[0] = nums[0];
            dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        }
        if(3 == nums.length){
            dp[0] = nums[0];
            dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
            dp[2] = nums[2]+dp[0] > dp[1] ? nums[2]+dp[0] : dp[1];
        }
        return dp[nums.length-1];
    }
}
