//Leetcode Q.989


class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      
        for(int i=num.length-1;i>=0;i--){
            int sum=num[i]+k;
             num[i] =sum%10;
            
            k= sum/10;
        }
       
        
       List<Integer> list = new ArrayList<>();
         while (k > 0) {             
            list.add(0, k % 10);    
            k /= 10;
        }
   
        for (int n : num) {
            list.add(n);
        }
        return list;
    }
}