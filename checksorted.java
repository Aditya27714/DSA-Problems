import java.util.*;
public class checksorted {
     public static  void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the array ");
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            // for(int j=i+1;j<n;j++){
                if(arr[i]>arr[i+1]){
                    System.out.println("False");
                    return;

                }
           
            }
            System.out.println("True");
        }
    }



