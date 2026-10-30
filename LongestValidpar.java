//Leetcode Q.32

class Solution {
    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int n=s.length();

        int res=0;

        //left to right

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                res=Math.max(res,open+close);
            }
            else if(close>open){
                open=0;
                close=0;
            }
        }

        open=0;
        close=0;

        //right to left
         for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                res=Math.max(res,open+close);
            }
            else if(open>close){
                open=0;
                close=0;
            }
        }

        return res;

    }
}


// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Character> stack = new Stack<>();

//         if(s.length()==0) return 0;

//        int currentlen=0;
//        int maxlen=0;

//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);

//             if (s.charAt(i)=='('){
//                 stack.push(c);
//             }
       
//             else if(c==')') {
//                 if(!stack.isEmpty()  && stack.peek()=='('){
//                  stack.pop();
//                  currentlen+=2;
//                  maxlen=Math.max(currentlen,maxlen);

//             }
//             else{
//                 stack.clear();
//                 currentlen=0;
//             }
//             }
 
//         }

//         return maxlen;

//     }
// }