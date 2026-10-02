//Leetvode Q.107

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
          List<List<Integer>> list = new ArrayList<>();
          helper(root,0,list);
          Collections.reverse(list);
          return list;
        
    }
    private void helper(TreeNode root , int level,List<List<Integer>>list){
        if(root==null) return;

      if(list.size()==level){
        list.add(new ArrayList<>());
      }

      list.get(level).add(root.val);

      helper(root.left,level+1,list);
      helper(root.right,level+1,list);

    }
}
/* we can use list(0,new arraylist) to directly add the list in front .

  if (list.size() == level) {
            list.add(0, new ArrayList<>());
        }

        // Calculate the index where this level’s list lives
        int index = list.size() - level - 1;
        list.get(index).add(root.val);

        helper(root.left, level + 1, list);
        helper(root.right, level + 1, list);

        */
        