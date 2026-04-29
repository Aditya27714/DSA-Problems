// Leetcode Q.217


class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> value = new HashSet<>();
         for(int num : nums){
            if(value.contains(num)){
                return true ;
            }
            value.add(num);
         }
         return false;
        
    }
}