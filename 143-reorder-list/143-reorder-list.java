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
    public void reorderList(ListNode head) {
        ListNode middle = middleNode(head);
        ListNode reverse = reverseNode(middle);
        middle = null;
        ListNode temp = head, cur = head.next;
        while(cur!=null && reverse!=null) {
            temp.next = reverse;
            reverse = reverse.next;
            temp = temp.next;
            if(reverse==null || cur==null) break;  
            temp.next = cur;
            cur = cur.next;
            temp = temp.next;            
        }
    }
    
    public static ListNode middleNode(ListNode node) {
        ListNode fast = node;
        ListNode middle = node;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            middle = middle.next;
        }
        return middle;
    }
    
    public static ListNode reverseNode(ListNode node) {
        ListNode pro = node.next, cur = node;
        cur.next = null;
        while(pro!=null) {
            ListNode pre = cur;
            cur = pro;
            pro = pro.next;
            cur.next = pre;
        }
        return cur;
    }
}