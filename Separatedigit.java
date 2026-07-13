//Leetcode Q.2553

class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            List<Integer> tempList = new ArrayList<>();
            while (num > 0) {
                tempList.add(0, num % 10);  
                num /= 10;
            }
            
            list.addAll(tempList);
        }
        
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//             int temp=nums[i]/10;
//             if(temp<9){
//             list.add(temp);
//             }
//             else{
//                 int v1=temp/10;
//                 list.add(v1);
//             }
//             int digit=nums[i]%10;
//             if(digit<9){
//                 list.add(digit);
//             }
//         }
//           int[] result = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             result[i] = list.get(i);
//         }
//         return result;
        
//     }
// }