/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mid(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode ms(ListNode head1,ListNode head2){
        ListNode merge = new ListNode(-1);
        ListNode temp = merge;
        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2!=null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return merge.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid = mid(head);
        ListNode rightSide = mid.next;
        mid.next = null;
        ListNode LHS = sortList(head);
        ListNode RHS = sortList(rightSide);
        return ms(LHS,RHS);
    }
}