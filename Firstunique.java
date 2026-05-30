//Leetcode Q.387

class Solution {
    public int firstUniqChar(String s) {
        List<Character> list = new ArrayList<>();
     
       char[] chars = s.toCharArray();
        for(char c : chars){
          list.add(c);
    }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.indexOf(c) == list.lastIndexOf(c)) {
                return i;
            }
        }
        
        return -1; 
    }
}


    