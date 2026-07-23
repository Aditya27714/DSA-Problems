//Leetcode Q.1832

class Solution {
    public boolean checkIfPangram(String sentence) {
       return sentence.chars().distinct().count() == 26;  
    }
}