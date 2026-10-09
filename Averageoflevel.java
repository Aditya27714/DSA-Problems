//Leetcode Q.637

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if(root==null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            double sum=0;
            double avg=0;
            int size=queue.size();
            
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

            avg=sum/size;
            list.add(avg);   
        }

        return list;
    }
}