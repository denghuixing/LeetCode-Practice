package Majority_Element_169;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{3,2,3};
        System.out.println(s.majorityElement(arr));
    }
    //The majority element is the element that appears more than ⌊ n/2 ⌋ times.
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for(int num: nums){
            if(numsCount.containsKey(num)){
                numsCount.put(num, numsCount.get(num)+1);
            }else{
                numsCount.put(num, 1);
            }
        }
        System.out.println(numsCount);
        int count = 0;
        int index = -1;
        for(Integer num : numsCount.keySet()){
            if(numsCount.get(num)>count){
                count = numsCount.get(num);
                index = num;
            }
        }
        if(count>=nums.length/2){
            return index;
        }else{
            return -1;
        }
//        return -1;
    }
}
