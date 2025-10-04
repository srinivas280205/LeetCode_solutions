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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;   // node before current sequence

        while (head != null) {
            // Detect duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with this value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev with the node after duplicates
                prev.next = head.next;
            } else {
                prev = prev.next; // move prev only when no duplicate found
            }
            head = head.next;
        }
        return dummy.next;
    }
}
