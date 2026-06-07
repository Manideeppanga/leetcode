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
    public ListNode middleNode(ListNode head) {
        ListNode t1 = head;
        int size = 0;
        while(t1 != null){
            size++;
            t1 = t1.next;
        }
        int mid = (size / 2) + 1;
        t1 = head;
        while(mid > 1){
            t1 = t1.next;
            mid--;
        }
        return t1;
    }
}