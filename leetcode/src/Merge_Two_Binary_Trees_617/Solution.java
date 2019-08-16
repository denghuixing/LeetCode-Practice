package Merge_Two_Binary_Trees_617;

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
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;

        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;
        s.printTreeByLayer(t1);
        s.printTreeByLayer(n1);
        s.printTreeByLayer(s.mergeTrees(t1,n1));
    }

    void printTreeByLayer(TreeNode node){
        if(node==null){
            return;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(node);
//        System.out.println(nodeQueue);
        while (!nodeQueue.isEmpty()){
            Queue<TreeNode> tempQueue = new LinkedList<>();
            while(!nodeQueue.isEmpty()){
                tempQueue.offer(nodeQueue.poll());
            }
//            System.out.println(tempQueue);
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

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        TreeNode resNode = new TreeNode(-1);
        if(t1 == null){
            resNode = t2;
        }else {
            if(t2 == null){
                resNode = t1;
            }else{
                resNode.val = t1.val + t2.val;
                resNode.left = mergeTrees(t1.left, t2.left);
                resNode.right = mergeTrees(t1.right, t2.right);
            }
        }
        return resNode;
    }
}
