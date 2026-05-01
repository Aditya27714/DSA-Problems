//Leetcode Q.75


class Solution {
    public void sortColors(int[] nums) {
        int left = 0; //for 0
        int right = nums.length-1; //for 2
        int mid =0; // for 1
        while(mid<=right){
            if(nums[mid]==0){
                int temp = nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left ++;
                mid ++;
            }
            else if(nums[mid] == 1){
                mid ++;
                }
                else { // for 2 
                    int temp = nums[mid];
                    nums[mid]= nums[right];
                    nums[right]= temp;
                    right -- ;
                }
        }
        
    }
}