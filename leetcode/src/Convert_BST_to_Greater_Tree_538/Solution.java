package Convert_BST_to_Greater_Tree_538;

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
    private int sum = 0;
    public static void main(String[] args){
        Solution s = new Solution();
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(13);
        n1.left = n2;
        n1.right = n3;
        s.printTreeByLayer(n1);
        s.printTreeByLayer(s.convertBST(n1));

    }

    public TreeNode convertBST(TreeNode root) {
        if(root != null){
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
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
