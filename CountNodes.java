//Leetcode Q.222

class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int leftheight=getheightleft(root);
        int rightheight=getheightright(root);

        if(leftheight==rightheight){
            return (1<< leftheight)-1;
        }

        else{
            return 1 + countNodes(root.left)+countNodes(root.right);
        }
    }
    private int getheightleft(TreeNode root){
        int height=0;

        while(root!=null){
            height++;
            root=root.left;
        }
        return height;
    }

     private int getheightright(TreeNode root){
        int height=0;

        while(root!=null){
            height++;
            root=root.right;
        }
        return height;
    }
}












// this is taking O(n)


// class Solution {
//     public int countNodes(TreeNode root) {
//         Set<Integer> set = new HashSet<>();
//         inorder(root,set);

//         return set.size();

//     }
//     private void inorder(TreeNode root,Set<Integer> set){
//         if(root ==null )return ;

//         inorder(root.left,set);
//         set.add(root.val);
//         inorder(root.right,set);
//     }
// }