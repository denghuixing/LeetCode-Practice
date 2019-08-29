package Contains_Duplicate_217;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3,1};
        boolean res = s.containsDuplicate(arr);
        System.out.println(res);
    }
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <=1) return false;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : nums){
            if(hashSet.contains(i)){
                return true;
            }else {
                hashSet.add(i);
            }
        }
        return false;
    }

}
