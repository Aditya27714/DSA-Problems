//Leetcode Q.643


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double windowsum =0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
         
        }
        double maxavg = windowsum/k ;

        for(int i=k;i<nums.length;i++){
            windowsum= (windowsum +nums[i]- nums[i-k]);
         double currentavg = windowsum/k;
          maxavg = Math.max(maxavg,currentavg);

        }

    return maxavg ; 
       
   }

}