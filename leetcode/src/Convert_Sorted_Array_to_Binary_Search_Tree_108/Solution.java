package Convert_Sorted_Array_to_Binary_Search_Tree_108;

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
        s.sortedArrayToBST(nums);
    }


    public TreeNode sortedArrayToBST(int[] nums) {

    }
}
