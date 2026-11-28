//Leetcode Q. 44

class Solution {
    public boolean isMatch(String s, String p) {
         
          Boolean [][] dp = new Boolean[s.length()][p.length()];
           int i = s.length()-1;
          int j = p.length()-1;

          return helper(s,p,i,j,dp);

        
    }
    static boolean helper(String s , String p,int i ,int j ,Boolean[][] dp){
        if(i<0 && j<0){
        return true;
       }

       if(i<0 && j>=0){
        while(j>=0){
            if(p.charAt(j)=='*'){
                j--;
            }
            else{
                return false;
            }

        }
        return true;
       }

       if(i>=0  && j<0){
        return false;
       }
       
       if(dp[i][j]!=null){
        return dp[i][j];
       }
         char chars =s.charAt(i);
         char charp =p.charAt(j);

         
         
        if(chars==charp || charp=='?'){
        return dp[i][j]= helper(s,p,i-1,j-1,dp);
        }

        else if (charp=='*'){
            return dp[i][j]= helper(s,p,i,j-1,dp) || helper(s,p,i-1,j,dp);
        }
        else{
            return dp[i][j]=false;
        }
        

    }
}    

