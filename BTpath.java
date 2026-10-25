//Leetcode Q.257

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
         preorder(root,"",list);
         return list;
    }
    private void preorder(TreeNode root,String path,List<String> list){
        if(root==null)return;
        
        path+=root.val;

        if(root.left==null  && root.right ==null ){
            list.add(path);
        }

    
        preorder(root.left,path + "->",list);
        preorder(root.right,path + "->",list);
    }
}