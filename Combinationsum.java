//Leetcode Q.39

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
   
 List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] candidates, int target, int idx,
                     List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (target < 0) return;

        for (int i = idx; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, path, res);
            path.remove(path.size() - 1);
        }
    }
}

    





//          List<List<Integer>> result = new ArrayList<>();
//          int sum=0;
//          for(int i=0;i<candidates.length;i++)
//          {
//             sum+=candidates[i];
//             if(target==sum || candidates[i]==target || target>sum )
//             {
//                List<Integer> combination = new ArrayList<>();
//                 combination.add(candidates[i]);  
//                 result.add(combination);          
//             }
//          }
// return result;
//     }
// }