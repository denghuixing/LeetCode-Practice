package Binary_Tree_Inorder_Traversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


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
        n0.right = n1;
        n1.left = n2;
        List<Integer> res = s.inorderTraversal2(n0);
        System.out.println(res);
    }
    //递归方法recursive
    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> list){
        if(null == root) return;
        if(root.left != null) inorder(root.left, list);
        list.add(root.val);
        if(root.right != null) inorder(root.right, list);
    }

    //迭代方法解决,用栈来处理
    public List<Integer> inorderTraversal2(TreeNode root){
        if(null == root) return null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
