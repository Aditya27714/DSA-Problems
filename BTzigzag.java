//Leetcode Q.103

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root,0,list);
        return list;
    }
    private void helper(TreeNode root,int level,List<List<Integer>> list){
        if(root==null) return;

        if(list.size()==level){
        list.add(new ArrayList<>());
       }

        if(level%2==0){
        list.get(level).add(root.val);
         }

         else{
            list.get(level).add(0,root.val);
         }

         helper(root.left,level+1,list);
         helper(root.right,level+1,list);

    }
}