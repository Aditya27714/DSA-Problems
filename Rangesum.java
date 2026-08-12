//Leetcode Q.303

class NumArray {

 private int[] arr;
    public NumArray(int[] nums) {
         arr = new int[nums.length+1];

        for(int i=1;i<=nums.length;i++)
        {
           arr[i]=nums[i-1]+arr[i-1];

        }
        
    }
    
    public int sumRange(int left, int right) {
      
      return arr[right+1]-arr[left];
    }
}
