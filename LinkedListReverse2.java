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
        if(head==null)return null;
        ListNode slow=null;
        ListNode mid=head;
        ListNode fast= head.next;
        while(mid!=null){
            mid.next= slow;
            slow=mid;
            mid=fast;
            if(fast!=null)
            fast=fast.next;
        }
        return slow;
        
    }
}
