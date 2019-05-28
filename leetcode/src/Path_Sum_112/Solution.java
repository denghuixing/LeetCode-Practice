package Path_Sum_112;

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
        System.out.println(s.hasPathSum(node0,4));
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        return false;
    }
}
