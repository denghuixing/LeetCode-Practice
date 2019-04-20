package Remove_Duplicates_from_Sorted_Array_26;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(new int[]{1,2,2,3,3,3,4,5,6,6,7,7,8}));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length<1) return 0;
        if(nums.length==1) return 1;
        int count = 0;
        int flag = nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i]!=flag){
                count++;
                flag = nums[i];
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
