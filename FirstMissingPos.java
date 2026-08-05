//Leetcode Q.41

class Solution {
    public int firstMissingPositive(int[] nums) {
        
    // Arrays.sort(nums);
    HashSet<Integer> list = new HashSet<>();
    for(int n:nums)
    {
        list.add(n);
    }
   for(int i=0;i<list.size();i++)
   {
    if(!list.contains(i+1)){
        return i+1;
    }
   
   }
return list.size()+1;
    }
}