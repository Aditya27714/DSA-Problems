//Leetcode Q.238

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
      
        int[]ans=new int[nums.length];
           ans[0]=1;

        for(int i=1;i<nums.length;i++)
        {
            ans[i]=nums[i-1]*ans[i-1];

        }

        int right=1;
        for(int i=nums.length-1;i>=0;i--)
        {
             ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}


        
//   List<Integer> list= new ArrayList<>();
//   for(int i=0;i<nums.length;i++)
//   {
//      int mult=1;
//      for(int j=0;j<nums.length;j++)
//      {
//      if (i==j) continue;
    
//      mult=mult*nums[j];
//      }
//      list.add(mult);

     

//   }

//          int[] res=new int[nums.length];
//           for(int i=0;i<list.size();i++)
//           {
//             res[i]= list.get(i);
//           }
        
//       return  res;
//     }
// }