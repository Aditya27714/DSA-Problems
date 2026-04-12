// Leetcode Q.169



class Solution {
    public int majorityElement(int[] nums) {
        System.out.println("Enter the number. ");
      int n = nums.length ;
      int temp= 0 ;
      int choose =nums[0];
       for(int i =0;i< nums.length;i++){
          int count =0;
        for(int j = i ;j<nums.length;j++){
            if(nums[i]==nums[j]){
            count ++ ;
            }
       }
       if(count>temp){
        temp=count ;
        choose = nums[i];
       }
       }
         if(temp > n/2){
            return choose ;
         }     
      return -1;
    } 
}
