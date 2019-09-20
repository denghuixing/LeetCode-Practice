package Product_of_Array_Except_Self_238;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = new int[]{9,0,-2};
        int[] res = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    public int[] productExceptSelf(int[] nums){
        if(nums.length<1) return new int[]{};
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        leftArr[0] = 1;
        rightArr[nums.length-1] = 1;
        for(int index = 1; index<nums.length; index++){
            leftArr[index] = nums[index-1] * leftArr[index-1];
        }
        System.out.println(Arrays.toString(leftArr));
        for(int index = nums.length-2; index>=0; index--){
            rightArr[index] = nums[index+1] * rightArr[index+1];
        }
        System.out.println(Arrays.toString(rightArr));
        for(int index = 0; index<nums.length; index++){
            rightArr[index] = leftArr[index]*rightArr[index];
        }
        return rightArr;
    }

    //this method doesn't make sense, you will have a lot problem in zero hadling
    public int[] productExceptSelf2(int[] nums) {
        if(nums.length<1) return new int[]{};
        int[] res = new int[nums.length];
        Integer productAll = 1;
        for(int i=0; i<nums.length; i++){
            productAll = productAll*(nums[i]);
        }
        for(int i=0; i<res.length; i++){
            res[i] = productAll/nums[i];
        }
        return res;
    }
}
