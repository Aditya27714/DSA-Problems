//Leetcode Q.1038

class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return null;
        helperSum(root);
        return root;
        
    }
    private void helperSum(TreeNode root){
        if(root==null) return;

        helperSum(root.right);

        sum+=root.val;
        root.val=sum;

        helperSum(root.left);
    }
}