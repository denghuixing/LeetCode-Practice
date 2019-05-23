package Convert_Sorted_Array_to_Binary_Search_Tree_108;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public String toString(){
        return this.val+"";
    }
}
public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode res = s.sortedArrayToBST(nums);
        System.out.println(s.levelOrderBottom(res));
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        System.out.println(Arrays.toString(nums));
        if(nums.length<1) return null;
        TreeNode root = new TreeNode(nums[nums.length/2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
        if((nums.length/2)+1 <= nums.length-1){
            System.out.println(((nums.length/2)+1) +" "+ (nums.length-1));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        }else{
            root.right = null;
        }
        return root;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resList = new LinkedList<>();
        if(root==null) return resList;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()){
            List<Integer> stageList = new ArrayList<>();
            Queue<TreeNode> subQueue = new LinkedList<>();
            while (!treeNodeQueue.isEmpty()){
                TreeNode tmp = treeNodeQueue.poll();
                stageList.add(tmp.val);
                if(tmp.left!=null){
                    subQueue.add(tmp.left);
                }
                if(tmp.right!=null){
                    subQueue.add(tmp.right);
                }
            }
            treeNodeQueue = subQueue;
            resList.add(stageList);
        }
        return resList;
    }
}
