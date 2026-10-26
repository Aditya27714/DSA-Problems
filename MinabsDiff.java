//Leetcode Q.530


class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size= queue.size();

            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                list.add(current.val);

                if(current.left!=null){
                    queue.offer(current.left);
                }
                 if(current.right!=null){
                    queue.offer(current.right);
                }

            }
        }

         Collections.sort(list);
         int temp=Integer.MAX_VALUE;;
         for(int i=1;i<list.size();i++){
            int diff = Math.abs(list.get(i)-list.get(i-1));
            temp=Math.min(temp,diff);
         }


  return temp;
         
        
    }
}