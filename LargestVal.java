//Leetcode Q/515

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size= queue.size();
             int temp=Integer.MIN_VALUE; //compare 

             for(int i=0;i<size;i++){
                TreeNode current =queue.poll();
                // temp=current.val;

                // if(temp<current.val){
                //     temp=current.val;
                // }
                   temp=Math.max(temp,current.val);
                
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
             }
           
              list.add(temp);
        }
        return list;
       
    }
}