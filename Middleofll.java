//Leetcode Q.876


class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode curr =head;
        int count =0;
      

        while(curr!=null)
        { 
            count ++;
            curr=curr.next;
        }
         int midIndex = count / 2;  
         curr =head;
          for(int i=0; i<midIndex; i++)
          {
            curr=curr.next;
          }
        return curr;
  }
}