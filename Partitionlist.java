//Leetcode Q.86


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
    public ListNode partition(ListNode head, int x) {
        
        ListNode beforedummy = new ListNode(0);
        ListNode afterdummy = new ListNode(0);

        ListNode before = beforedummy;
        ListNode after = afterdummy;

        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                before.next=curr;
                before=before.next;
            }
            else{
                after.next=curr;
                after=after.next;
            }
            curr=curr.next;
        }

        after.next=null;
        before.next=afterdummy.next;

         return beforedummy.next;
    }
}