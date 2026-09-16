//Leetcode Q.4

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        double temp=0;
        double res=0;
        for(int n:nums1){
            list.add(n);
        }
        for(int c:nums2){
            list.add(c);
        }
        Collections.sort(list);
 
        int length=list.size();

        if(length %2 !=0){

          int var=length/2;
          temp= list.get(var);
        }
        else{
            int var1=(length-1)/2;
            int var2=length/2;
             res=list.get(var1)+list.get(var2);
             temp=res/2;
    
        }
        return temp;

    }
}