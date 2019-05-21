package Symmetric_Tree_101;

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
        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        System.out.println(s.isSymmetric(node0));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null && root.right!=null){
            if(root.left.val==root.right.val){
                System.out.println(root.left+" "+root.right);
                TreeNode nodeLeft = new TreeNode(-1);
                TreeNode nodeRight = new TreeNode(-1);
                nodeLeft.left = root.left.left;
                nodeLeft.right = root.right.right;
                nodeRight.left = root.left.right;
                nodeRight.right = root.right.left;
                return isSymmetric(nodeLeft)&&isSymmetric(nodeRight);
            }else {
                System.out.println(root.left+" "+root.right);
                return false;
            }
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
}
