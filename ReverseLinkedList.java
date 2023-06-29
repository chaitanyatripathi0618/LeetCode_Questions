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
    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return head;
        }
        ListNode temp=null;
        ListNode prev=head;

        
       
        while(prev != null){
            ListNode curr= prev.next;
            prev.next=temp;
            temp=prev;
            prev=curr;

        }
        return temp;
        
        
    }
}
