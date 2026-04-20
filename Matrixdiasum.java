//Leetcode Q.1572 


class Solution {
    public int diagonalSum(int[][] mat) {
    
        int sum=0;
        int l=mat.length;
        
        for(int i=0;i<l;i++){
            sum +=mat[i][i];

              if(i!=l-1-i) {
                   sum += mat [i][l - 1 - i];
                 }
        }
        return sum ;
        
    }
}