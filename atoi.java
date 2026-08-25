//Leetcode Q.8

class Solution {
    public int myAtoi(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        int i=0;
        
        while(i<n && arr[i]==' ') i++;

        int sign=1; //default true;
     if (i < n && (arr[i] == '+' || arr[i] == '-'))
        {
            sign=(arr[i]=='-')? -1 :1;
            i++;
        }

        StringBuilder sb=  new StringBuilder();
        while(i<n && Character.isDigit(arr[i]))
        {
            sb.append(arr[i]);
            i++;
        }
          if (sb.length() == 0) return 0;

           int res=0;
          for(int j=0;j<sb.length();j++)
          {
            int digit=sb.charAt(j)-'0';
            
        if (res > (Integer.MAX_VALUE - digit) / 10) 
        {
             return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
            res=res*10+digit;

          }

            // if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            // if (sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
    

        return  (sign * res);

       }
    }
