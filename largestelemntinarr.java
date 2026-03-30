import java.util.*;
public class largestelemntinarr {
    public static  void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the array ");
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
       System.out.println("Largest element is "+ max);
        
      
    }
    
}
