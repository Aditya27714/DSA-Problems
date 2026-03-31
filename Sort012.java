// sorting an array like first 0,then 1. then 2

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int n = sc.nextInt();
     System.out.println("Enter the array(only 0,1,2)");
     int [] arr = new int [n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
      int left=0;
      int mid=0;
      int right=n-1;
      
      while(mid<=right){
      
        if(arr[mid]==0){
     int temp = arr[left];
        arr[left] = arr[mid];
        arr[mid] = temp;
             mid++;
            left++;
        }
       else if(arr[mid]==1){
          mid ++;
    }
   else{
    int  temp=arr[mid];
     arr[mid]=arr[right];
     arr[right]=temp;
     right --;
   }

}
System.out.println("The  sorted array is"+Arrays.toString(arr));

    }
    
}
