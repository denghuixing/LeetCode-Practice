package Remove_DUplicates_from_Sorted_List_83;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(3);
        ListNode a6 = new ListNode(3);
        ListNode a7 = new ListNode(5);
        ListNode a8 = new ListNode(5);
        ListNode a9 = new ListNode(5);
        ListNode a10 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        s.printList(s.deleteDuplicates(a1));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){return head;}
        ListNode node = head;
        while (node.next!=null){
            if(node.next.val==node.val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return head;
    }

    public void printList(ListNode node){
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}
