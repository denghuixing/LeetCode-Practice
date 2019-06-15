package Linked_List_Cycle_141;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode node0 = new ListNode(0);
        System.out.println(s.hasCycle(node0));
    }

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (slow != fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
