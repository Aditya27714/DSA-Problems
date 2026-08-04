//Leetcode Q.1331

class Solution {
    public int[] arrayRankTransform(int[] arr) {
 
   TreeMap<Integer,Integer> map=new TreeMap<>();
     for(int n:arr)
     {
    map.put(n,0);
     } 
      
      int i=1 ;//rank
      for(int key : map.keySet())
      {
        map.put(key,i++);
      }

        int[] result=new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
            result[j]=map.get(arr[j]);
        }
return result;

    }
}