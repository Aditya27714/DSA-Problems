//Leetcode Q. 3754

class Solution {
    public long sumAndMultiply(int n) {

        if(n==0) return 0;
       
        StringBuilder sb= new StringBuilder();
        for(char ch:String.valueOf(n).toCharArray())
        {
            if(ch !='0')
            {
                sb.append(ch);
            }
        }
            int x = Integer.parseInt(sb.toString());
            int temp=x;
            long sum=0;

            while(temp>0)
            {
            sum += temp % 10;
            temp /= 10;
            }

            
        
            long result = sum*(long)x;

            return result;
        
    }
}