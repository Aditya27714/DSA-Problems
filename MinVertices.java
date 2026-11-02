//Leetcode Q. 1557

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> res =new ArrayList<>();
       

        int[] degree = new int[n];

         for(List<Integer>edge : edges ){
               
            int from = edge.get(0);
             int to  = edge.get(1);

           /* indgree 0 vertices is our goal*/
           /* we only need that vertices whose in degree is 0 . means they are impossible to reach*/

           degree[to]++;
            }
         
    

        for(int i=0;i<n;i++){
            if(degree[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}