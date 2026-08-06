//Leetcode Q.49

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String,List<String>> map = new HashMap<>();
    for(String w:strs)
    {
    char[] arr = w.toCharArray();
    Arrays.sort(arr);
    String str=new String(arr);
    
    if(!map.containsKey(str))
    {
        map.put(str,new ArrayList());
    }
    map.get(str).add(w);

    }
    return new ArrayList(map.values());
  }
}