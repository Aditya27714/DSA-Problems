//Leetcode Q.1922


class Solution {
     static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
    
      long even = (n + 1) / 2; 
        long odd = n / 2;         

        long res = (pow(5, even) * pow(4, odd)) % MOD;
        return (int) res;
    
    }
   
   long pow(long a,long b){
  
  if(b==0) return 1;


long half=pow(a,b/2);
long res= half*half%MOD;


if(b%2!=0)
{
     res=(res*a)%MOD ;
}
   
  
    return res;
   }
}