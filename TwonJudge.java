//Leetcode Q.997

class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int [] degree = new int[n+1];

        for(int[] realtion : trust){
           int a= realtion[0];
           int b= realtion[1];

           degree[a]--;
           degree[b]++;
        }

           for(int i=1;i<=n;i++){
            if(degree[i]==n-1){
                return i;
            }
           }

        
        return -1;
    }
}