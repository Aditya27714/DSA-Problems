//Leetcode Q. 367

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num<2) return true;

        int left =2;
        int right =num/2;
        

        while(left<=right){
          long mid =left + (right - left) / 2;
          long square = mid *mid;
            if(square==num){
                return true;
            }
            else if(square <num) {
                left =  (int) mid +1;
            
            }
            else{
                right =  (int) mid-1;
            }
        }
 return false ; 
    }
}