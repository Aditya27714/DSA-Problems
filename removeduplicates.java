import java.util.*;
public class removeduplicates {
     public static  void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the array ");
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i =0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
             } 
            arr[count]=arr[i];
            count ++;
        }
         arr[count] = arr[n- 1];
         System.out.println(count+1);
}

}