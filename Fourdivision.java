//Leetcode Q. 1390

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalsum=0;
       
       for(int num : nums){
        int sum =0; 
        int count =0;
        for(int i =1 ;i <= Math.sqrt(num);i++){
            if(num %i == 0){
                sum+= i;
                count ++;  
                int otherdivisor = num /i;
                if(otherdivisor !=i){
                    count ++;
                    sum +=otherdivisor;
                }
       }
        }
        if(count ==4){
            totalsum +=sum;
        }
       } if(totalsum ==0){
        return 0;
       }
      
       return totalsum ;
       
    }
}
   