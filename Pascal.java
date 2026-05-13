//Leetcode  Q. 118 


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
       
       for(int i=0;i<numRows;i++){ // for row
        List <Integer> row = new ArrayList<>();
        for(int j=0;j<=i;j++){  // in row elements
            if(j== 0 || j==i){ // first and last position have always one 
                row.add(1);
            }
            else {
                 int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);

            }
        }
        triangle.add(row);
       }
        return triangle;
    }
}