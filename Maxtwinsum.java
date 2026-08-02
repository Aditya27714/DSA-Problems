//Leetcode Q.2130

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
    public int pairSum(ListNode head) {
        List<Integer> list =new ArrayList<>();
        int maxsum=0;
        
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
         
         int left=0;
        int right=list.size()-1;

        while(left<right)
        {
           int sum = list.get(left) + list.get(right);
           maxsum=Math.max(sum,maxsum);
           left++;
           right--;


        }
        return maxsum;
    }
}