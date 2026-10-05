//leetcode Q.129

class Solution {
    public int sumNumbers(TreeNode root) {
       
      return  helper(root,0);
      

    }
    private int  helper(TreeNode root,int currentsum){
        if (root == null) return 0;
 
       currentsum = currentsum * 10 + root.val;

       if(root.left==null&& root.right==null){
        return currentsum;
       }

       return helper(root.left,currentsum) + helper(root.right,currentsum);

    }
}
