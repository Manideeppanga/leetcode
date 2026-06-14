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
    public ListNode reverse(ListNode temp){
        ListNode curr = temp;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode t1 = head;
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode t2 = reverse(mid);
        int maxSum = Integer.MIN_VALUE;
        while(t1 != null && t2 != null){
           int sum = 0;
            sum += t1.val;
            sum += t2.val;
            maxSum = Math.max(sum,maxSum);
            t1 = t1.next;
            t2 = t2.next;
        }
        return maxSum;
    }
}