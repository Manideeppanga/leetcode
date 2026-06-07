/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode collision(ListNode sh,ListNode bh,int d){
        int i = 0;
        while(i < d){
            bh = bh.next;
            i++;
        }
        while(sh != bh){
            sh = sh.next;
            bh = bh.next;
        }
        return sh;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = 0,s2 = 0;
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1 != null){
            s1++;
            t1 = t1.next;
        }
        while(t2 != null){
            s2++;
            t2 = t2.next;
        }
        int diff = Math.abs(s1 - s2);
        if(s1 > s2){
            return collision(headB,headA,diff);
        }
        else{
            return collision(headA,headB,diff);
        }
    }
}