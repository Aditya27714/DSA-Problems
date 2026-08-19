//Leetcode Q.486

class Solution {
    public boolean predictTheWinner(int[] nums) {

            return solve(nums, 0, nums.length - 1) >= 0;
    }

    private int solve(int[] nums, int left, int right) 
    {
        if (left == right) return nums[left]; 

        int pickLeft = nums[left] - solve(nums, left + 1, right);

        int pickRight = nums[right] - solve(nums, left, right - 1);

        return Math.max(pickLeft, pickRight);
    }
}
    
//         int n=nums.length;
//         int left=0;
//         int right=n-1;
//         int sum1=0;
//         int sum2=0;
//         boolean turn=true;  /*flag*/

//         while(left<=right)
//         {
//             if(nums[left]>=nums[right] )
//             {
//                 if(turn) sum1+=nums[left];
//                 else sum2+=nums[left];
//                 left++;
               
//             }
//             else
//             {
//                 if(turn)sum1+=nums[right];
//                 else sum2+=nums[right];
//                 right--;
                
//             }
//             turn =!turn;

//         }
       
//        return sum1>=sum2;
//     }
// }