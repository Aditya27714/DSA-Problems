//Leetcode Q.328


class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null ) return head;

        ListNode odd=head;
        ListNode even=head.next;
         ListNode even_head=even;

        while(even!=null &&  even.next!=null){
        odd.next=odd.next.next;
          odd=odd.next;
          even.next=even.next.next;
          even=even.next;

        }
        odd.next=even_head;

        return head;
    }
}