package Minimum_Depth_of_Binary_Tree_111;


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

        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(0);
        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        System.out.println(s.minDepth(node0));
    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return Math.min(minDepth(root.left),minDepth(root.right));
        }
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }else {
            return Math.min(depth(root.left)+1, depth(root.right)+1);
        }
    }
}
