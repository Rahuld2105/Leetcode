class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;

        ListNode curr = head;
        int index = 1;

        while (curr != null) {
            ListNode next = curr.next; // save next
            curr.next = null;          // detach current

            if (index % 2 == 1) {      // ODD position
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            } else {                   // EVEN position
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }

            index++;
            curr = next;
        }

        if (oddHead == null) return evenHead;
        oddTail.next = evenHead;

        return oddHead;
    }
}
