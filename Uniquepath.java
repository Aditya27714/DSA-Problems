//Leetcode Q.62



class Solution {
    public int uniquePaths(int m, int n) {
         int[][] memo = new int[m][n];
        return countPaths(m - 1, n - 1, memo);
    }

    private int countPaths(int row, int col, int[][] memo) 
    {
        
        if (row == 0 && col == 0) return 1;

        
        if (row < 0 || col < 0) return 0;

        
        if (memo[row][col] != 0) return memo[row][col];


        memo[row][col] = countPaths(row - 1, col, memo) + countPaths(row, col - 1, memo);
        return memo[row][col];
    }
}
    