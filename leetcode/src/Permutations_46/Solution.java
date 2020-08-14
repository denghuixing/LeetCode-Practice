package Permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = new int[]{1,2,3};
        List<List<Integer>> res =sol.permute(arr);
        System.out.println(res);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        if(null == nums || 0 == nums.length){
            return res;
        }
        boolean[] visited = new boolean[nums.length];
        permute_helper(nums, res, item, visited);
        return res;
    }

    void permute_helper(int[] nums, List<List<Integer>> res, List<Integer> item, boolean[] visited){
        if(item.size() == nums.length){
            res.add(item);
            System.out.println(item);
            System.out.println(res);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(visited[i]==false){
                item.add(nums[i]);
                visited[i] = true;
                permute_helper(nums, res, item, visited);
                item.remove(item.size()-1);
                visited[i] = false;
            }
        }
//        System.out.println(item);
    }

}
