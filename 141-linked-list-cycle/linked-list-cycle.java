public class Solution {

    // Definition of Singly Linked List
    /*public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }*/

   public boolean hasCycle(ListNode head) {
        // Base case: empty list or single node pointing to null cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Traverse as long as fast has valid forward steps
        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            // Fast runner caught up with slow runner -> cycle detected
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached, no cycle exists
        return false;
    }
}