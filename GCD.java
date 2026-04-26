//Leetcode Q.  1979

import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int a =nums[0];
        int b= nums[nums.length-1];
        return gcd(a,b);
    }
         private static int gcd(int a,int b){
            if(b==0)return a;
            return gcd (b,a % b);

         } 
}