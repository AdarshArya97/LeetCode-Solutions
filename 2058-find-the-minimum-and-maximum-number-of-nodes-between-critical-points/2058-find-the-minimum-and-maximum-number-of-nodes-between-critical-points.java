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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int first = -1;       // first critical point
        int prev = -1;        // previous critical point
        int minDist = Integer.MAX_VALUE;
        int maxDist = -1;

        ListNode prevNode = head;
        ListNode curr = head.next;

        int index = 1;

        while (curr.next != null) {

            // Check if curr is a critical point
            if ((curr.val > prevNode.val && curr.val > curr.next.val) ||
                (curr.val < prevNode.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    // First critical point
                    first = index;
                } else {
                    // Distance from previous critical point
                    int dist = index - prev;

                    minDist = Math.min(minDist, dist);

                    // Distance from first to current
                    maxDist = index - first;
                }

                prev = index;
            }

            prevNode = curr;
            curr = curr.next;
            index++;
        }

        if (maxDist == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDist, maxDist};
    }
}