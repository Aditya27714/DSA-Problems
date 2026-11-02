//Leetcode Q.797

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();

            stack.push(Arrays.asList(0));

        while (!stack.isEmpty()) {
            List<Integer> path = stack.pop();
            int lastNode = path.get(path.size() - 1);

            
            if (lastNode == graph.length - 1) {
                result.add(new ArrayList<>(path));
            } else {
              
                for (int neighbor : graph[lastNode]) {
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    stack.push(newPath);
                }
            }
        }
        return result;

    }
}