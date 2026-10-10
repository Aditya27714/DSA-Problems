//Leetcode Q.1161

class Solution {
    public int maxLevelSum(TreeNode root) {
         List<Integer> list = new ArrayList<>();

         if(root==null) return 0;
         
         Queue<TreeNode> queue= new LinkedList<>();
         queue.offer(root);

         while(!queue.isEmpty()){
            int size=queue.size();
            int sum=0;

            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                sum+=current.val;

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }

            }
            list.add(sum);
         }
        //  if(list.size()==1) return 1;
        
             int max = list.get(0);   
             int index = 1;           

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i+1;
            }
        }
        return index;

    }
}