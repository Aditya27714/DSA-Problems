//Leetcode Q.3731

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
     List<Integer> list = new ArrayList<>();
     Arrays.sort(nums);

     int min=nums[0];
     int max=nums[nums.length-1];

     int i=0;
    while(min<=max&& i<nums.length)
    {
        if(min!=nums[i])
        {
            list.add(min);
            min++;
            continue;
        }
        i++;
        min++;
    }

return list;
    }
}