package Maximun_Depth_of_Binary_Tree_104;
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
        node3.left = node4;
//        node1.right = node4;
//        node2.left = node5;
//        node2.right = node6;
        System.out.println(s.maxDepth(node0));
    }

    public int maxDepth(TreeNode root) {
        if(root!=null){
            return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        }else{
            return 0;
        }
    }
}
