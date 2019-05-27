package Balanced_Binary_Tree_110;


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

        System.out.println(s.isBalanced(node0));
        System.out.println(s.depth(node0));


    }
    public boolean isBalanced2(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null && root.right!=null)
            return isBalanced2(root.left)&&isBalanced2(root.right);
        if(root.left==null && root.right==null) return true;
        if(root.left==null && root.right!=null){
            if(root.right.left!=null || root.right.right!=null) return false;
            else return true;
        }
        if(root.left!=null && root.right==null){
            if(root.left.left!=null || root.left.right!=null) return false;
            else return true;
        }
        return false;
    }
    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }else {
            return Math.max(depth(root.left)+1, depth(root.right)+1);
        }
    }

    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        if(Math.abs(depth(root.left)-depth(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
//        return false;
    }



}
