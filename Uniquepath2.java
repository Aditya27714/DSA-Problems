//Leetcode Q.63  

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m=obstacleGrid.length;
         int n=obstacleGrid[0].length;
         int[][] dp=new int[m][n];
         return helper(m-1,n-1,obstacleGrid,dp);

    }
    private int helper(int row, int col,int[][] obstacleGrid, int [][]dp){
        

        if(row<0 || col<0 || obstacleGrid[row][col]==1) return 0;
           if(row==0 &&col ==0) return 1;

        if(dp[row][col]!=0){
           return dp[row][col];
        }

        dp[row][col]= helper(row-1,col,obstacleGrid,dp)+helper(row,col-1,obstacleGrid,dp);
        return dp[row][col];
    }
}