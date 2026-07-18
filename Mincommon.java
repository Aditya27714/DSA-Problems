//Leetcode Q . Mincommon.java


class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j]) 
            {
                return nums1[i];
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
    
    return -1;

    }
}

       
//         List<Integer> list = new ArrayList<>();
//         for(int n:nums1)
//         {
//             list.add(n);
//         }
       
//          for(int n:nums2)
//         {
//           if(list.contains(n)) return n;
//         }
//         return -1;
//     }
// }