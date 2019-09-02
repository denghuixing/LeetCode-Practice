package Missing_Number_268;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{2,0};
        int[] arr2 = new int[]{3,0,1};
        int res = s.missingNumber2(arr2);
        System.out.println(res);
    }


    //use hash table
    public int missingNumber(int[] nums) {
        if(nums.length<1) return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        for(int i=0; i< nums.length; i++){
            if(!numSet.contains(i)){
                return i;
            }
        }
        return nums.length;
    }

    int missingNumber2(int[] nums){
        if(nums.length<1) return 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return ((0+nums.length)*(nums.length+1))/2 - sum;
    }
}
