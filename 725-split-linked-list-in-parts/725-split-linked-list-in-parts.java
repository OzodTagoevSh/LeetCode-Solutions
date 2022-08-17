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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode h1 = head;
        int size = 0;
        while(h1!=null) {
            h1 = h1.next;
            size++;
        }
        ListNode[] answer = new ListNode[k];        
        if(size/k>0) {
            int n=size/k, rem=size%k;           
            for(int i=0; i<k; i++) {
                int j=1, l=n;
                ListNode helper = head;
                answer[i]=helper;
                if(i<rem) {
                    l++;
                }  
                while(j++<l && helper!=null) {
                    helper=helper.next;                    
                }
                head = helper.next;
                helper.next = null;
            }           
        } else {
            int i;
            for(i=0; i<size; i++) {
                answer[i]=head;
                head = answer[i].next;
                answer[i].next = null;
            }
            for(; i<k; i++) answer[i] = null;
        }     
        return answer;        
    }
}