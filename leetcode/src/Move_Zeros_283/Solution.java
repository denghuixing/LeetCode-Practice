package Move_Zeros_283;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
        s.moveZeroes2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                tmp.add(nums[i]);
            }
        }
        for(int j=0; j<tmp.size(); j++){
            nums[j] = tmp.get(j);
        }
        for(int i=tmp.size(); i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        for(int i=0,j=0; i<nums.length; i++){
            if(nums[i]!=0){
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }
    }
}
