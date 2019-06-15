package Intersection_of_Two_LinkedLists_160;

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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node5.next = node3;
//        s.printListNode(node0);
//        s.printListNode(node5);
        System.out.println(s.getIntersectionNode(node0,node5).val);
    }
    public void printListNode(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode listA = headA;
        ListNode listB = headB;
        boolean flag1= false;
        boolean flag2 =false;
        while (listA!=listB){
            if(listA.next != null){
                listA = listA.next;
            }else {
                if(flag1){
                    return null;
                }else {
                    listA = headB;
                    flag1 = true;
                }
//                listA = flag1==true ? listA : headB;
//                flag1 = true;
            }
            if(listB.next != null){
                listB = listB.next;
            }else{
                if(flag2){
                    return null;
                }else{
                    listB = headA;
                    flag2 = true;
                }
//                listB = flag2==true ? listB : headA;
//                flag2 = true;
            }
        }
        return listA;
    }
}
