//Leetcode Q.3471

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n= nums.length;
          if( k==n){
            Arrays.sort(nums);
            int max= nums[n-1];
            return max;
          }
       Map<Integer, Integer> freq = new HashMap<>();
         for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
            
            if (k == 1) {
            int ans = -1;
            for (int num : nums) {
                if (freq.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        int left=-1;
        int right=-1;

        if(freq.get(nums[0])==1){
            left=nums[0];
        }
        if(freq.get(nums[n-1])==1){
            right=nums[n-1];
        }

        int res= Math.max(left,right);
        return res;
            
    }
}
      