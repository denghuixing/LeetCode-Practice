package Intersection_of_Two_Array_II_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr1 = new int[]{4,9,5};
        int[] arr2 = new int[]{9,4,9,8,4};
        int[] res = s.intersect(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums1){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] resArr = new int[list.size()] ;
        for(int i=0; i<list.size(); i++){
            resArr[i] = list.get(i);
        }
        return resArr;
    }
}
