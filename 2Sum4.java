//Leetcode Q.653


class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
         inorder(root,seen);
         

        //  if(seen.size()==1){
        //     if(!seen.contains(k)) return false;
        //  }

         for(int n : seen){
            int compare=k-n;
            if(compare!=n && seen.contains(compare)) {
                return true;
            }
         }

         return false;

        
    }
    private void inorder(TreeNode root,Set<Integer> seen){
        if(root==null) return ;

        inorder(root.left,seen);
        seen.add(root.val);
        inorder(root.right,seen);
    }
}