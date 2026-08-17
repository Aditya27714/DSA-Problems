//Leetcode Q.3016

class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> map = new HashMap<>();
        int result=0;

        for(char ch:word.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        List<Integer> list = new ArrayList<>(map.values());
        
         list.sort(Collections.reverseOrder());

         for(int i=0;i<list.size();i++)
         {
            int fre=list.get(i);
            int press =i/8 +1;
             result+=press*fre;
         }

         return result;
    }
}