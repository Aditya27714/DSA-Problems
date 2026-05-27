// Leetcode Q.1011

class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int left =0;
    int right=0;
    for(int n: weights){
        left = Math.max(left, n);
        right+=n;
    }
    while(left<right){
        int mid = left + (right - left) / 2;
        if(canship(weights, days, mid)){
             right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }
        

    

    private boolean canship(int[] weights,int days,int capacity){
        int totaldays=1;
        int currentload=0;

        for(int w:weights){
            if(currentload + w> capacity){
                totaldays ++;
                currentload=0;
            }
         
                currentload+=w;
            }
        
         return totaldays <= days;
    }
    
    }