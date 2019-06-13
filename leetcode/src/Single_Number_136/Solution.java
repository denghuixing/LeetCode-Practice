package Single_Number_136;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = new int[]{2,2,1};
        System.out.println(s.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(numSet.contains(nums[i])){
                numSet.remove(nums[i]);
            }else {
                numSet.add(nums[i]);
            }
        }
//        System.out.println(numSet);
        return (Integer) numSet.toArray()[0];
    }
}
