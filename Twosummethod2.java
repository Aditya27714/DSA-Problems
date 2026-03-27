import java.util.*;

public class Twosummethod2 {
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

       Map<Integer,Integer> map = new HashMap<>();
     int index1=-1; 
     int index2=-1;
       for(int i =0;i<n;i++){
        int complement = tar - arr[i];
        if(map.containsKey(complement)){
            index1 = map.get(complement);
            index2=i;
          break;
        }
            map.put(arr[i], i);
        }
         System.out.println("Indices"+index1+" "+index2);
       }
 
       

}
