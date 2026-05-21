//LEetcode Q.692


class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

      
        List<String> candidates = new ArrayList<>(map.keySet());
    
     
     candidates.sort((a, b) -> {
    int freqCompare = map.get(b) - map.get(a);
    if (freqCompare == 0) {
        return a.compareTo(b);
    }
    return freqCompare;
});

return candidates.subList(0, k);   
    }
}