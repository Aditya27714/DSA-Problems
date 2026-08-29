//Leetcode Q.1021

class Solution {
    public String removeOuterParentheses(String s) {
      
      StringBuilder sb = new StringBuilder();
      Stack<Character> stack = new Stack<>();

      for(char ch:s.toCharArray())
      {
        if(ch=='(')
        {
        if(!stack.isEmpty())
        {
         sb.append(ch);
        }
        stack.push(ch);
        }

      
        else{
            stack.pop();
            if(!stack.isEmpty()) 
            {
            sb.append(ch);
            }

        }
      }
  return sb.toString();

    }
}

