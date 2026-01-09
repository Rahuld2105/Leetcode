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
    public ListNode partition(ListNode head, int x) {
        ListNode ltHead = null;
        ListNode gtHead = null;
        ListNode ltTail = null;
        ListNode gtTail = null;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                if(ltHead==null){
                    ltHead = ltTail =curr;
                }else{
                    ltTail.next = curr;
                    ltTail = curr;
                }
            }else{
                if(gtHead==null){
                    gtHead = gtTail =curr;
                }else{
                    gtTail.next = curr;
                    gtTail = curr;
                }
                

            }
            curr = curr.next;
        }
        if(ltHead==null){
            return gtHead;
        }
        if(gtHead==null){
            return ltHead;
        }
        ltTail.next = gtHead;
        gtTail.next = null;
        return ltHead;
    }
}