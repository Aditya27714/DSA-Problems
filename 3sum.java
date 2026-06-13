//Leetcode Q.15

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;  
                    while (left < right && nums[right] == nums[right + 1]) right--; 
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}







// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;

//         Arrays.sort(nums);

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         set.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(set);
//     }
// }













// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         int n = nums.length;
    
//       Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(  nums[i] +nums[j]+nums[k]==0){
//                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                       
//                           if (!list.contains(triplet)) {  
//                             list.add(triplet);
//                     }
//                 }
//             }
//         }
//         }
    

//         return list;
    
// }

