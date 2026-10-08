//Leetcode Q. 617

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root;
        if(root1==null && root2==null) return null;

        if(root1!=null && root2!=null) {
           root=new TreeNode(root1.val +root2.val);

        }
        else if(root1==null && root2!=null){
          root=new TreeNode(root2.val);
        }
        else{
         root= new TreeNode(root1.val);
        }

      root.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
      root.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);


        return root;
    }
}