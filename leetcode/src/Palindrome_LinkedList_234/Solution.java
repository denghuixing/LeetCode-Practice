package Palindrome_LinkedList_234;


//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(1);
        ListNode n8 = new ListNode(0);
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n8;
        s.printLinkedList(n0);
        System.out.println(s.isPalindrome(n0));

    }

    public boolean isPalindrome(ListNode head) {
        if(null == head || null == head.next) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast.next && null != fast.next.next){
            slow = slow.next;
            fast = fast.next.next;
        }

        printLinkedList(fast);
        printLinkedList(slow);
        ListNode prev = slow.next;
//        if(null == prev){
//            return head.val == head.next.val ? true : false;
//        }
        ListNode pcur = prev.next;
        while(pcur != null){
            prev.next = pcur.next;
            pcur.next = slow.next;
            slow.next = pcur;
            pcur = prev.next;
        }
//        while (null != tmpNode){
//            System.out.println(slow.next.val);
//            printLinkedList(slow.next);
//            System.out.println("tmpnode "+ tmpNode.val);
//            ListNode tmp2 = tmpNode.next;
//            slow.next = tmp2;
//            tmpNode.next = tmp2.next;
////            tmpNode.next.next = tmpNode;
//
//            tmp2.next = tmpNode;
////            slow.next.next = tmpNode;
//            tmpNode = tmpNode.next;
////
//        }
        printLinkedList(slow.next);
        ListNode reverseList = slow.next;
        while (reverseList != null){
            if(head.val != reverseList.val){
                return false;
            }else{
                head = head.next;
                reverseList = reverseList.next;
            }
        }
        return true;
    }

    public void printLinkedList(ListNode head){
        while (head != null){
            System.out.print(head.val+ " ");
            head = head.next;
        }
        System.out.println();
    }

}
