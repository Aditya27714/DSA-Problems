
// Leetcode Q.125


class Solution {
    public boolean isPalindrome(String s) {
        // boolean isPalindrome = true;1
             s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        for(int i =0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false ;
                // isPalindrome = false;
                // break;
            }
        }
      
    return true;
}
}