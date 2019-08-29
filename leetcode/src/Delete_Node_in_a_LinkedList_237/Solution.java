package Delete_Node_in_a_LinkedList_237;


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode n0 = new ListNode(5);
        s.deleteNode(n0);
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
