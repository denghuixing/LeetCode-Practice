package Diameter_of_Binary_Tree_543;

import java.util.Arrays;
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

        TreeNode n0 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;

//        s.printTreeByLayer(n0);
        System.out.println(s.diameterOfBinaryTree(n0));

    }


    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int maxLen = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()){
            Queue<TreeNode> tempQueue = new LinkedList<>();
            while(!nodeQueue.isEmpty()){
                tempQueue.offer(nodeQueue.poll());
            }
            while (!tempQueue.isEmpty()){
                TreeNode tempNode = tempQueue.poll();
                int left_depth = getTreeDepth(tempNode.left);
                int right_depth = getTreeDepth(tempNode.right);
                int len = left_depth + right_depth;
                if(len > maxLen){
                    maxLen = len;
                }
//                System.out.print(tempNode.val+ " ");
                if(tempNode.left!=null){
                    nodeQueue.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    nodeQueue.offer(tempNode.right);
                }
            }
//            System.out.println(" ");
        }
//        System.out.println(Arrays.toString(getTreeDepth(root)));
        return maxLen;
    }
    public  int getTreeDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);

        return left >= right ? left + 1 : right + 1;
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
