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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head; 
        for(int i=1; i<=n; i++) 
            fast = fast.next;
        
        if(fast == null) 
            head = head.next;
        else {
            ListNode slow = head;
            ListNode helper = slow;
            while(fast!=null) {
                fast = fast.next;
                helper = slow;
                slow = slow.next;
            }
            helper.next = slow.next;
        }
        return head;        
    }
}