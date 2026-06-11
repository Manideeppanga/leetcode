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
    public ListNode convert(ArrayList<Integer> help){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int i = 0;i < help.size();i++){
            ListNode newNode = new ListNode(help.get(i));
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> help = new ArrayList<>();
        for(int i = 0;i < lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                help.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(help);
        ListNode head = convert(help);
        return head;
    }
}