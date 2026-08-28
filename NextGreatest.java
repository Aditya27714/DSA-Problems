//Leetcode Q .496

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        List<Integer> list = new ArrayList<>();

          for (int x : nums1) {
            int nextGreater = -1;
        for(int i=0;i<nums2.length-1;i++)
        {
            // int j=0;
            if(nums2[i]==x)
        {
            for (int k = i + 1; k < nums2.length; k++) 
            {
               if (nums2[k] > x) 
               {
                    nextGreater = nums2[k];
                    break;
               }

            }
            break;
        }
        }
          list.add(nextGreater);
          }

        int[] arr= new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}