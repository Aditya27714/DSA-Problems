// public class Runningsum {
    
// }

// l Q.1480 running sum of 1d array
 class Solution {
    public int[] runningSum(int[] nums) {

       int  runningsum = 0;
       int[] result = new int [nums.length];

       
       for(int i  = 0 ; i<nums.length; i++){
           runningsum =runningsum + nums[i];
       
          result[i] = runningsum ; 

       }

     return result ;

    }
 }
