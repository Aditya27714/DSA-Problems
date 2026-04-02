// in this code it only give true or false . 

import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int n = sc.nextInt();
     System.out.println("Enter the array");
     int [] arr = new int [n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
       System.out.println("Enter the target");
       int tar =sc.nextInt();
 Arrays.sort(arr);
       int left =0;
       int right =n-1;
        boolean found = false;

       while(left<right){
        int sum = arr[left]+arr[right];
        if(sum==tar){
          System.out.println("true");
          found = true ;

          break;
        }
        if(sum<tar){
            left ++;
        }
        else{
            right -- ;
        }
        
       }

if(!found){
    System.out.println("false");
}
    }
    
}
