//Leetcode Q.2

 /* it efficency is very poor */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 =new ArrayList<>();
         List<Integer> list2 =new ArrayList<>();
     while (l1 != null) 
    {
         list1.add(l1.val);
            l1 = l1.next;
     }
        while (l2 != null) 
        {
            list2.add(l2.val);
            l2 = l2.next;
        }

      
        Collections.reverse(list1);
        Collections.reverse(list2);
        
     List<Integer> sumList = new ArrayList<>();
        int i = list1.size() - 1;
        int j = list2.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) 
        {
            int sum = carry;
            if (i >= 0) sum += list1.get(i--);
            if (j >= 0) sum += list2.get(j--);

            sumList.add(sum % 10);
            carry = sum / 10;
        }
          
           

      ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : sumList) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    }
