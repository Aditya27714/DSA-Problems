// Leetcode Q. 268

class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:nums){
            actualsum =actualsum + num;
        }
        return totalsum - actualsum ;
    }
}