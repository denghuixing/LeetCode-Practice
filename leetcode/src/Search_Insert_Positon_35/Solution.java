package Search_Insert_Positon_35;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{1,3,5,6};
        System.out.println(s.searchInsert(arr,5));
        System.out.println(s.searchInsert(arr,2));
        System.out.println(s.searchInsert(arr,6));
    }

    public int searchInsert(int[] nums, int target) {
        if(nums.length<1) return 0;
        if(target<=nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
//        System.out.println("hehe");
        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]+" "+nums[i+1]);
            if(target>=nums[i] && target<= nums[i+1]){
                return i+1;
            }
        }
        return nums.length;
    }
}
