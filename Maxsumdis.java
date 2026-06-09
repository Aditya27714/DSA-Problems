//Leetcode Q. 2461

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0, maxSum = 0;

        for (int i = 0; i < n; i++) {
          
            sum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

          
            if (i >= k) {
                sum -= nums[i - k];
                freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
                if (freq.get(nums[i - k]) == 0) {
                    freq.remove(nums[i - k]);
                }
            }

            if (i >= k - 1 && freq.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}



// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long maxsum=0;
//           for (int i = 0; i + k <= n; i++) {
//             HashSet<Integer> set = new HashSet<>();
//             long sum=0;


//             for (int j = i; j < i + k; j++) {
//                 if (set.contains(nums[j])) {
//                     break;}

//             set.add(nums[j]);
//             sum+=nums[j];
//             }

//              if (set.size() == k) {
//                 maxsum = Math.max(maxsum, sum);
//             }
//         }
//         return maxsum;
//     }
// }
                    
    