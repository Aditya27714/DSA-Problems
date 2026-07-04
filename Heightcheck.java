//leetcode Q. 1051


class Solution {
    public int heightChecker(int[] heights) {
    int count=0;

  /* here make a copy of array  and sort it */
    
    List<Integer> expected= new ArrayList<>();
    for(int n: heights)
    {
        expected.add(n);
    }
    Collections.sort(expected);

    for(int i=0;i<heights.length;i++)
    {
        if(heights[i]==expected.get(i))
        {
            continue;
        }
        else
        {
            count ++;
        }
    }
return count;
    }
}