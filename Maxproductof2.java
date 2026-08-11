//Leetcode Q.3536


class Solution {
    public int maxProduct(int n) {
        int mlt=1;
       
    List<Integer> list =new ArrayList<>();
        while(n>0)
        {
            int digit=n%10;
           list.add(digit);
            n=n/10;
        }
        Collections.sort(list);
         int size = list.size();

        mlt=list.get(size - 1) *list.get(size - 2);

        return mlt;
        
    }
}