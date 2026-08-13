//Leetcode Q.347

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else
            {
                map.put(n,1);
            }
        }
         int[] arr = new int[k];
        for(int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxKey = -1;

        
          int index = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

               int key = entry.getKey();
               int value = entry.getValue();


            if (value > maxFreq) {
                    maxFreq = value;
                    maxKey = key;
                }
            }

            arr[i] = maxKey;      
            map.remove(maxKey);
            }
         
         return arr;

        }
    
}
