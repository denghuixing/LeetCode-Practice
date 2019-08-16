package Reverse_Linked_List_206;


 //Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next =n5;
//        s.printList(n1);
        s.printList(s.reverseList(n1));
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode resHead = new ListNode(-1);
//        resHead.next = head;
        while (head != null){
//            System.out.print("in while "+head.val+" ");
            ListNode tmpNode = resHead.next;
            resHead.next = new ListNode(head.val);
            resHead.next.next = tmpNode;
            head = head.next;
//            System.out.print("in while "+head.val+" ");
        }
//        System.out.println(" ");
        return resHead.next;
    }

    void printList(ListNode node){
        while (node!=null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
