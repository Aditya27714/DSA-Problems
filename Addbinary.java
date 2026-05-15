//Leetcode Q 67


class Solution {
    public String addBinary(String a, String b) {
        
        java.math.BigInteger num1 = new java.math.BigInteger(a, 2);
        java.math.BigInteger num2 = new java.math.BigInteger(b, 2);

        java.math.BigInteger sum = num1.add(num2);

  
        return sum.toString(2);
    }
}
