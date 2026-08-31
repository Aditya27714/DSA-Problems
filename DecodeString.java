//Leetcode Q.394

class Solution {
     public String decodeString(String s) {

        Stack<Integer> numstack= new Stack<>();
        Stack<StringBuilder> chstack= new Stack<>();
        int num=0;
        StringBuilder  curr =new StringBuilder();


        for(char c : s.toCharArray()){
          
          if(Character.isDigit(c)){
             num= num*10+(c-'0');
          }

          else if(c=='['){
           numstack.push(num);
           chstack.push(curr);
           num=0;
           curr=new StringBuilder();
          }

          else if(c==']'){
            int repeat=numstack.pop();
            StringBuilder prev=chstack.pop();
            for(int i=0;i<repeat;i++){
                prev.append(curr);

            }
            curr=prev;
          }
           else{
            curr.append(c);
           }

          }
           return curr.toString();

        }
      
     }