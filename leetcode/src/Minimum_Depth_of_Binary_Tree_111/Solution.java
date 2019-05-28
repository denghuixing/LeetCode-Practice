package Minimum_Depth_of_Binary_Tree_111;


import java.util.LinkedList;
import java.util.Queue;

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
        node0.left = null;
        node0.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        System.out.println(s.minDepth(node0));
    }
    public int minDepth(TreeNode root) {
        if(root==null){return 0;}
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        int i =0;
        while (!treeNodeQueue.isEmpty()){
            Queue<TreeNode> tempQueue = new LinkedList<>();
            i++;
            while (!treeNodeQueue.isEmpty()){
                TreeNode tempNode = treeNodeQueue.poll();
                if(tempNode.left==null && tempNode.right==null) return i;
                if(tempNode.left!=null) tempQueue.offer(tempNode.left);
                if(tempNode.right!=null) tempQueue.offer(tempNode.right);
            }
            treeNodeQueue = tempQueue;

        }
        return i;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }else {
            return Math.min(depth(root.left)+1, depth(root.right)+1);
        }
    }
}
