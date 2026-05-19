import java.util.Scanner;

public class Missingno {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enetr the size of array ");
        int n =in.nextInt();
        System.out.println("Enter the array ");;
        int[] arr =new int [n];
        for (int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        for(int i =0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
                if(count!=2){
                    System.out.println(arr[i]);
                }
            
            
        }
        
        
    }
    
}
