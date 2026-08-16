//Leetcode Q.2965

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n=grid.length;
        int range=n*n;

        List<Integer> list =new ArrayList<>();
         List<Integer> list2 =new ArrayList<>();
        for(int[] row: grid)
        {
            for(int value: row)
            {
                if(list.contains(value))
                {
                  list2.add(value);
                }
                list.add(value);
            }
        }

         Set<Integer> set= new TreeSet<>(list);
        //  for(int m:list)
        //  {
        //     set.add(m);
        //  }
      for (int i = 1; i <= range; i++) {
            if (!set.contains(i)) {
            list2.add(i);
            }
        }

          int[] arr = list2.stream().mapToInt(Integer::intValue).toArray();

      return arr;

    }
}