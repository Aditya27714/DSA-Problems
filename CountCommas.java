//Leetcode Q.3870

class Solution {
    public int countCommas(int n) {
    
    if(n<1000) return 0;

    if(n>=1000){
        int count=Math.abs(n-1000);
        return 1+count;
    }

    

    return 0;
    }
}
        