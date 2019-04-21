package Remove_Element_27;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        int[] arr2 = new int[]{3,2,2,3};
        int[] arr3 = new int[]{1};
        System.out.println(s.removeElement(arr,2));
        System.out.println(s.removeElement(arr2,3));
        System.out.println(s.removeElement(arr3,1));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public int removeElement(int[] nums, int val) {
        if(nums.length<1) return 0;
//        if(nums.length==1) return 1;
        int count=0;
//        int flag = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
//        return 3;

    }
}
