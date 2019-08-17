package Find_All_Disappeared_in_an_Array_448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(s.findDisappearedNumbers(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int sum = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[Math.abs(nums[i])-1] > 0){
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
//        System.out.println(Arrays.toString(nums));
//        res.add(((1+nums.length)*nums.length)/2 - sum);
        return res;
    }
}
