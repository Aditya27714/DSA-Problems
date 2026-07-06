// leetcode Q. 9


class Solution {
    public static boolean isPalindrome(int x) {
                
                if (x < 0) {
            return false;
        }


    
        int original = x ;
        int reversed = 0;

        while (x!= 0) {
            int digit = x % 10;       
            reversed = reversed * 10 + digit; 
            x = x / 10;            
        }

        return original == reversed;    
    }

    public static void main(String[] args) {
        int number = 121; 

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}


