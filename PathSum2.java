//Leetcode Q.113

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root,targetSum,new ArrayList<>(),list);
        return list;
    }

    private void helper(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>>list){
        if(root == null) return ;

        path.add(root.val);
        
        if(root.left==null && root.right==null && targetSum==root.val){
            list.add(new ArrayList<>(path)); 
        }
        else{
            helper(root.left,targetSum-root.val,path,list);
            helper(root.right,targetSum-root.val,path,list);
        }

        path.remove(path.size()-1);

    }
}