//Leetcode Q.508

class Solution {
     Map<Integer,Integer> map = new HashMap<>();
     int maxFreq = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null) return new int[0];

        postorder(root);

        List<Integer> result = new ArrayList<>();
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

          return result.stream().mapToInt(i -> i).toArray();
        

    }
    private int  postorder(TreeNode root){
        if(root==null) return 0 ;
        

       int left= postorder(root.left);
       int right=postorder(root.right);

       int sum=root.val+left+right;

       map.put(sum,map.getOrDefault(sum,0)+1);

       maxFreq=Math.max(maxFreq,map.get(sum));

       return sum;
    }
}