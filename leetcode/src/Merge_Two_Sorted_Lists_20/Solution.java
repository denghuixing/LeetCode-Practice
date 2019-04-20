package Merge_Two_Sorted_Lists_20;
class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
//        ListNode a4 = new ListNode(5);
        a1.next=a2;
        a2.next=a3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        ListNode res = s.mergeTwoLists(a1,b1);
//        System.out.println();
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        l1.next = l2;
//        return l1;

        ListNode res = new ListNode(0);
        ListNode head = res;
//        head = res;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                res.next = l1;
                res = l1;
                l1 = l1.next;
            }else {
                res.next = l2;
                res = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) res.next = l1;
        else res.next = l2;
        return head.next;
    }
}
