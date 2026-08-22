//Leetcode Q.409

class Solution {
    public int longestPalindrome(String s) {
        int sum=0;
        boolean ifodd=false;
        if(s.length()==1) return 1;
        Map<Character, Integer> map = new HashMap<>();
       for(char ch : s.toCharArray())
       {
          map.put(ch,map.getOrDefault(ch,0)+1);

       }

       for(Map.Entry<Character,Integer> entry : map.entrySet())
       {
       int  count=entry.getValue();
        if(count%2==0)
        {
            sum+=count;
      
        }
        else
        {
            sum+=count-1;
            ifodd=true;
        
        }

       }
      
       return ifodd ? sum+1 : sum;
    }
}