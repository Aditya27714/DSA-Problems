//Leetcode Q.98

class Solution {
    public boolean isValidBST(TreeNode root) {
         return BT(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
     private  boolean BT(TreeNode node, long min, long max){
        if(node==null) return true;

        if(node.val<=min || node.val>=max) return false;

        return BT(node.left,min,node.val) && BT(node.right,node.val,max);

     }
}