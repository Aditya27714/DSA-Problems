//Leetcode Q.682

class Solution {
    public int calPoints(String[] operations) {
       
         Stack<Integer> stack = new Stack<>();

         for(String s:operations)
         {
            if(s.equals("C")){
             stack.pop();
            }
          else  if(s.equals("D")){
                //push double of top elemnt
                stack.push(stack.peek()*2);
            }
            else if(s.equals("+")){
                //add the two previous scrore and if only one add and push it 
                 if (stack.size() >= 2) {
              int top = stack.pop();
              int newTop = top + stack.peek();
             stack.push(top);
              stack.push(newTop);
         }

        else if (stack.size() == 1) {
        // If only one score exists, just duplicate it
           stack.push(stack.peek());
       }
}

            
          else {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int score:stack)
        {
            sum+=score;
        }

        return sum;

    }
}