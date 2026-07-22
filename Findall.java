//Leetcode Q.1732

class Solution {
    public int largestAltitude(int[] gain) {
        
         int maxalt= 0;  
        int current = 0;
        
        for (int g : gain) {
            current += g;              
            maxalt = Math.max(maxalt, current); 
        }
        
        return maxalt;
    }
}
