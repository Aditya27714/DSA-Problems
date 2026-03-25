import java.util.*;
public class Majorityelement {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int n = sc.nextInt();
     System.out.println("Enter the array");
     int [] arr = new int [n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
       

       Map<Integer,Integer> map = new HashMap<>();
       for(int num : arr){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
       }  
     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    if(entry.getValue() > n/2){
        System.out.println("Majority element is: " + entry.getKey());
    }
}

        }
       }

