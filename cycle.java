//Leetcode Q. 141

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */    
public class Solution {
    public boolean hasCycle(ListNode head) {

        /* using fast and slow pointer*/
       
         if(head==null || head.next==null) return false;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow) return true;
        }
   return false;

    }
}



        /* this solution involves hashset and it is not efficient */

//         ListNode curr =head;
//         if(head==null || head.next==null) return false;
//          HashSet <ListNode> result =new HashSet<>();

//          while(curr!=null)
//      {
//          if(result.contains(curr))
//          {
//             return true;
//          }
//          result.add(curr);
        
//          curr=curr.next;
//      }  
//      return false;   
//     }
// }