//Leetcode Q.506

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
       TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());

       for(int i=0;i<score.length;i++){
           
           map.put(score[i],i);

       }
       String [] answer =new String[score.length];

       int rank=0;
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             int idx = entry.getValue(); 
               if (rank == 0) {
                answer[idx]="Gold Medal";
               }
               else if (rank == 1) {
                answer[idx]="Silver Medal";
               }
               else  if (rank == 2) {
                answer[idx]="Bronze Medal";
               }
               else{
                 answer[idx] = String.valueOf(rank + 1);
               }
               rank++;
      
       } 
  return answer;
    }
}