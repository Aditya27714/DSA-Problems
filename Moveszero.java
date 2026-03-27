import java.util.*;
public class Moveszero {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enetr the size of array ");
        int n =in.nextInt();
        System.out.println("Enter the array ");;
        int[] arr =new int [n];
        for (int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==0 && arr[j]!=0 ){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

            // for(int k=0;k<n;k++){
            // System.out.println("Array after : " +   arr[k]);
            // }
            for( int nums :arr){
                System.out.print(nums +" ");
            }
            
        in.close();
        }
    }
    

