//Leetcode Q.114 


class Solution {
    TreeNode nextRight = null;
    public void flatten(TreeNode root) {
 

           if(root == null) return ;
           // we are using reverse approach here .
           // we start from right then go to left and then root.

           flatten(root.right);
           flatten(root.left);

           root.left=null;
           root.right=nextRight;
           nextRight=root;
        
          
    }
}