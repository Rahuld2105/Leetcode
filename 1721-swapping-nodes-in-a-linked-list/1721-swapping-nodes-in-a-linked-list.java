class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        // 1️⃣ find size of linked list
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // 2️⃣ create array of size n+1 (1-based indexing)
        int arr[] = new int[n + 1];

        // 3️⃣ store linked list values in array
        temp = head;
        int i = 1;
        while (temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        // 4️⃣ swap kth from left and kth from right
        int left = k;
        int right = n - k + 1;

        int swapTemp = arr[left];
        arr[left] = arr[right];
        arr[right] = swapTemp;

        ListNode temp1 = head;
        for(int j=1;j<arr.length;j++){
            temp1.val = arr[j];
            temp1 = temp1.next;
        }
        return head;

        
    }
}
