//Leetcode Q.513

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        int ans=root.val;

        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode current =queue.poll();

                if(i==0){
                    ans=current.val;
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
        }
        return ans;
    }
}