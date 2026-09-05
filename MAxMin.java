//Leetcode Q.2091

class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(nums[i],i);
      }
     
      int min= Arrays.stream(nums).min().getAsInt();
      int max= Arrays.stream(nums).max().getAsInt();

        int value1 = map.get(min);
        int value2 = map.get(max);

        int front = Math.max(value1, value2) + 1;  

        int back = n - Math.min(value1, value2);
        
        /*third case */
        int both1 = (value1 + 1) + (n - value2);
        int both2 = (value2 + 1) + (n - value1);


    return Math.min(front, Math.min(back, Math.min(both1, both2)));

    }
}


// class Solution {
//     public int minimumDeletions(int[] nums) {
//         int n=nums.length;
//         if(n==1) return 1;
//         Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//         map.put(nums[i],i);
//       }
//       Arrays.sort(nums);
//       int min=nums[0];
//       int max=nums[n-1];

//         int value1 = map.get(min);
//         int value2 = map.get(max);
     
//         int a=Math.abs(n-value1);
//         int b=Math.abs(0-value1);
//         int idx1=Math.min(a,b);

//         int c=Math.abs(n-value2);
//         int d=Math.abs(0-value2);
//         int idx2=Math.min(c,d);
     

//         return idx1+idx2;

//     }
// }