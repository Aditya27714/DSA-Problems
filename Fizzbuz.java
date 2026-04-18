
//Leetcode Q.412


class Solution {
    public List<String> fizzBuzz(int n) {
       
    String  []nums =  new String  [n];
        // int u = nums.length;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                nums[i-1]="FizzBuzz";

            }
            else if(i%3==0){
                nums[i-1]="Fizz";

            }
            else if(i%5==0){
                nums[i-1]="Buzz";
            }
            else {
                nums[i-1]=String.valueOf(i);
            }
        }
        for (String s : nums) {
            System.out.println(s);
        }
         return Arrays.asList(nums); 
    }

    }
