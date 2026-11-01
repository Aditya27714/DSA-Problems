//Leetcode Q.1791

class Solution {
    public int findCenter(int[][] edges) {
        int n=0;

        for(int[] edge : edges){
            n= Math.max(n,Math.max(edge[0],edge[1]));
        }
        
        int[] degree = new int[n+1];

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];

            degree[a]++;
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