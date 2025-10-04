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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        // Step 1: Find length and tail
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // Step 2: Make it circular
        tail.next = head;
        
        // Step 3: Find new head (length - k % length steps from start)
        k = k % length;
        int stepsToNewHead = length - k;
        
        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }
        
        // Step 4: Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}
