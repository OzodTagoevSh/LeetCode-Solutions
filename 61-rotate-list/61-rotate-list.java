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
        while(help!=null) {
            size++;
            help = help.next;
        }        
        if(size < k) k = k % size;
        k = size-k;
        if(k==0 || k==size) return head;
        help = head;               
        while(k>1 && help!=null) {
            help = help.next;
            k--;
        }
        ListNode cut = help.next;
        help.next = null;
        ListNode newHead = cut;
        while(cut.next!=null) cut=cut.next;
        cut.next = head;
        return newHead;
    }
}