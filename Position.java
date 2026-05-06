//Leetcode Q.34


import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
   List <Integer> list = new ArrayList <>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
            list.add(i);
            }
        }
        if(list.isEmpty()) {
        return new int [] {-1,-1};
        }
          return new int[]{list.get(0), list.get(list.size()-1)};

    }
}