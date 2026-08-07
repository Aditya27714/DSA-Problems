//Leetcode Q.128

class Solution {
    public int longestConsecutive(int[] nums) {
         TreeSet<Integer> set = new TreeSet<>();
         int current =1;

         for(int n: nums)
         {
            set.add(n);
         }
    if(nums.length==0) return 0;

   int longest=1;
      List<Integer> list = new ArrayList<>(set);
      for(int i=1;i<list.size();i++)
      {
        if(list.get(i)==list.get(i-1)+1)
        {
            current++;
            longest=Math.max(longest,current);
        }
        else
        {
          current=1;
        }
      }
  return longest;
    }
}