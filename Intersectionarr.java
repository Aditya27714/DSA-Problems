//Leetcode 349

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
       for(int num: nums1){
        set1.add(num);
       }
       Set<Integer> setfinal = new HashSet<>();
       for(int num: nums2){
        if(set1.contains(num)){
            setfinal.add(num);
        }
       }
       int []result = new int [setfinal.size()];
       int i=0;
       for(int num: setfinal){
        result[i++]=num;
       }
       return result;
    }
}