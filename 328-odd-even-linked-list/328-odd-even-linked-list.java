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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode first = head, second = head.next;
        ListNode newHead = second;
        head = first;
        while(first.next!=null && second.next!=null) {
            first.next = second.next;
            first = first.next;
            second.next = first.next;
            second = second.next;
        }
        if(first!=null) first.next=null;
        first = head;
        while(first.next!=null) first=first.next;
        first.next=newHead;
        return head;
    }
}