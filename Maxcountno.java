//Leetcode Q.2529


class Solution {
    public int maximumCount(int[] nums) {
        
        int count =0;
        int temp=0;
        for (int i =0;i<nums.length;i++){
            
            if(nums[i]<0){
                count ++;
            }
            else if(nums[i]>0){
                temp ++;
            }
        }
        if(temp>count){
            return temp ;
        }
        return count ;
       

    }
}