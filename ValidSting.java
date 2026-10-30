//Leetcode Q.678

class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();

        int low=0;
        int high=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                low++;
                high++;

            }
            else if(s.charAt(i)==')'){
                low--;
                low=Math.max(low,0);
                high--;
            }
            else{
                low--;
                low=Math.max(low,0);
                high++;

            }
             if (high < 0) {
                return false;
             }
        }
        return low==0;
    }
}