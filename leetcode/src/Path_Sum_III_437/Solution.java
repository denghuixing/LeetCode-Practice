package Path_Sum_III_437;
import java.util.LinkedList;
import java.util.Queue;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();

        TreeNode n0 = new TreeNode(10);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(-3);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode (11);
        TreeNode n6 = new TreeNode(3);
        TreeNode n7 = new TreeNode(-2);
        TreeNode n8 = new TreeNode(1);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.right = n8;

//        s.printTreeByLayer(n0);
        System.out.println(s.pathSum(n0,8));
    }

    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
//        System.out.println(root.val);
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int helper(TreeNode root, int sum){
        int res = 0;
        if(root == null){
            return res;
        }
//        System.out.println(root.val+" "+sum);
        if(sum == root.val) res++;
        res += helper(root.left, sum - root.val) + helper(root.right, sum-root.val);
        return res;
    }

    void printTreeByLayer(TreeNode node){
        if(node==null){ return; }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(node);
        while (!nodeQueue.isEmpty()){
            Queue<TreeNode> tempQueue = new LinkedList<>();
            while(!nodeQueue.isEmpty()){
                tempQueue.offer(nodeQueue.poll());
            }
            while (!tempQueue.isEmpty()){
                TreeNode tempNode = tempQueue.poll();
                System.out.print(tempNode.val+ " ");
                if(tempNode.left!=null){
                    nodeQueue.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    nodeQueue.offer(tempNode.right);
                }
            }
            System.out.println(" ");
        }
    }
}
