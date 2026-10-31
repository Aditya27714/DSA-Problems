//leetcode Q.106

class Solution {
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
         postIndex=postorder.length-1;

         return helper(inorder , postorder , 0 , inorder.length-1);
    }

    private TreeNode helper(int[] inorder,int[] postorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=postorder[postIndex--];

        TreeNode root = new TreeNode(rootval);

       int index=left;  //inorder

       while(inorder[index]!=rootval){
         index++;
       }

       root.right = helper(inorder , postorder ,index+1 ,right);

       root.left = helper(inorder , postorder ,left , index-1);

      return root;

    }
}