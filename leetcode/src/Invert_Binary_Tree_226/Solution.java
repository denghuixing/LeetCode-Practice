package Invert_Binary_Tree_226;


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
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(9);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.right = n2;
//        s.printTreeByLayer(t1);
        s.printTreeByLayer(s.invertTree(n1));
//        System.out.println(n1.val);
//        System.out.println(n1.left);
//        System.out.println(n1.right.val);
//        TreeNode tmp = s.invertTree(n1);
//        System.out.println(tmp.val);
//        System.out.println(tmp.left);
//        System.out.println(tmp.right.val);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){return null;}
        if(root.left == null && root.right == null){
            return root;
        }
        if(root.left != null && root.right != null){
            System.out.println("hehe1");
            TreeNode tempNode = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tempNode);
        }
        if(root.left == null && root.right != null){
            System.out.println("hehe2");
            root.left = invertTree(root.right);
            root.right = null;
//            return root;
        }else if(root.right == null && root.left != null){
            System.out.println("hehe3");
            root.right = invertTree(root.left);
            root.left = null;
//            return root;
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
