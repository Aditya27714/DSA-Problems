//Leetcode Q.203


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
         
          ListNode curr =dummy;
           
        while(curr.next!=null)
{
     if(curr.next.val==val)
     {
        curr.next=curr.next.next;
     }
     else
     {
        curr=curr.next;
     }
}
return dummy.next;
    }
}
        // this code is use only for single oocurance of val
//         ListNode temp =head;
        
//         if(head==null) return  null ;
        

//         if(head.val==val){
//             head=head.next;
//             return head ;
//         }
//           while(temp.next!=null && temp.next.val!=val){
//             temp=temp.next;
//           }
//           if(temp.next!=null){
//             temp.next=temp.next.next;
//           }
          
//         return head; 
//     }
// }