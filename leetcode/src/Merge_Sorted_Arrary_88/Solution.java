package Merge_Sorted_Arrary_88;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        s.merge(nums1, 0, nums2, nums2.length);
    }
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int point = 0;
//        for(int i=0; i<n; i++){
//            for(int j=point; j<m+i;j++){
//                if(nums2[i]>=nums1[j]&&nums2[i]<=nums1[j+1]){
//
//                }
//            }
//        }
//
//    }

    public void merge(int[] nums1, int m, int[] nums2, int n){
        if(nums1.length<m+n){return;}
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<m; i++){
            res.add(nums1[i]);
        }
        int pos = 0;
        for (int i=0; i<n; i++){
            if(nums2[i]<=res.get(0)){
                res.add(0,nums2[i]);
                continue;
            }
            if(nums2[i]>=res.get(res.size()-1)){
                for(int j=i;j<n;j++){
                    res.add(nums2[j]);
                }
                break;
            }
            for(int j=res.size()-1; j>0; j--){
                if(nums2[i]<=res.get(j)){
                    res.add(j,nums2[i]);
                    break;
                }
            }
        }
//        System.out.println(res);
        for(int i=0; i<m+n; i++){
            nums1[i] = res.get(i);
        }
//        System.out.println(Arrays.toString(nums1));
//        nums1 = res.toArray(int[] nums1);
    }
}
