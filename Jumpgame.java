//Leetcode Q. 55

class Solution {
    public boolean canJump(int[] nums) {
        int lastplace = nums.length -1;
        for(int i=nums.length -2;i>=0;i--){
            if(i + nums[i]>= lastplace){
                lastplace = i;
            }
        }
return lastplace == 0 ;
    }
}