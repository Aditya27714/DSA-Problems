//Leetcode Q. 485

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
     int temp=0;
       for(int i =0;i<nums.length;i++){
       if(nums[i]==1){
        sum++;
       }
       if (sum>temp){
        temp=sum;
       }
       else if (nums[i]!=1){
        sum=0;
       }
       }
        return temp;
    }
}