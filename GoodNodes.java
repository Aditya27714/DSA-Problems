//Leetcode Q.1448

class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
    private int helper(TreeNode root, int currentMax){
        if(root==null) return 0;

        int count=0;
         if(root.val>=currentMax){
            currentMax=root.val;
            count=1;

         }
       count+=  helper(root.left,currentMax);
       count+=  helper(root.right,currentMax);

         return count;

    }
}