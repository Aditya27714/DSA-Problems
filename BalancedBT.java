//Leetcode Q.110

class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root==null) return true;

       int leftheight=getheight(root.left);
       int rightheight=getheight(root.right);

       if(Math.abs(leftheight -rightheight)>1) return false;

       return isBalanced(root.left) && isBalanced(root.right);

    }
    private int getheight(TreeNode root){
        if(root==null) return 0;
        return Math.max(getheight(root.left),getheight(root.right)) +1;
    }
}

/* we are using getheight to get the height of each node

we are using the isbalanced to check the differnce at each level */