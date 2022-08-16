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
        if(head==null || head.next==null) return head;
        ListNode help = head;
        int size = 0;
        while(help.next!=null) {
            size++;
            help = help.next;
        } 
        size++;
        k = size - k % size;
        if(k==0 || k==size) return head;
        ListNode slow = head;
        while(k>1 && slow!=null) {
            slow = slow.next;
            k--;
        }
        ListNode ans=slow.next;
        slow.next = null;
        help.next = head;
        return ans;
    }
}