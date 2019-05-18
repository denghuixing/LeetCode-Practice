package Same_Tree_100;


//  Definition for a binary tree node.
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
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3);

        node0.left = node1;
        node0.right = node2;

        node3.left = node4;
        node3.right = node5;

        System.out.println(s.isSameTree(node0, node3));

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null && q!=null){
            if(p.val == q.val){
                System.out.println(p.val+" "+ q.val);
                boolean leftCheck = isSameTree(p.left, q.left);
                System.out.println(p+" "+q+" after leftcheck");
                boolean rightCheck = isSameTree(p.right, q.right);
                return leftCheck && rightCheck;
            }else {
                return false;
            }
        }
        if(p==null && q==null){
            System.out.println(p+" "+q);
            return true;
        }
        if(!(p==null^q==null)){
            System.out.println(p+" "+q+" false return");
            return false;
        }
        return false;
    }
}
