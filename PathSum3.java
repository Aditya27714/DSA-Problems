//Leetcode Q 437

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;

        return dfs(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
    private int dfs(TreeNode root ,long targetSum){
        if(root==null) return 0;
        
        int count=0;
        if(root.val==targetSum) count++;

        count+=dfs(root.left,targetSum-root.val);
        count+=dfs(root.right,targetSum-root.val);

        return count;
    }
}

// dfs use here for go to one node and explore it all till the end whether it can have targetsum or not.

// pathsum is use for to have that same process for each node in the tree