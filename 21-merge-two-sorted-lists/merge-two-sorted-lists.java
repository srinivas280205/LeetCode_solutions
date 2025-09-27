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
import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Collect values from both lists
        List<Integer> values = new ArrayList<>();
        
        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }
        
        // Step 2: Sort the collected values
        Collections.sort(values);
        
        // Step 3: Build a new linked list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
