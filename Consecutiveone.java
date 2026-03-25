import java.util.*;
public class Consecutiveone {
    
      public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        System.out.println("Enetr the size of array ");
        int n =in.nextInt();
        System.out.println("Enter the array ");;
        int[] arr =new int [n];
        for (int i =0;i<n;i++){
            arr[i]=in.nextInt();      
        }  
        // here sum is adding the consective one and temp is store the value of sum.
     int sum=0;
     int temp=0;
       for(int i =0;i<arr.length;i++){
       if(arr[i]==1){
        sum++;
       }
       if (sum>temp){
        temp=sum;
       }
       else if (arr[i]!=1){
        sum=0;
       }
       }
  System.out.println("Max nos."+ temp);

      }
    }
