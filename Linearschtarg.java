import java.util.Scanner;

public class Linearschtarg {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        System.out.println("Enetr the size of array ");
        int n =in.nextInt();
        System.out.println("Enter the array ");;
        int[] arr =new int [n];
        for (int i =0;i<n;i++){
            arr[i]=in.nextInt();
           
    }
    System.out.println("enter the target  ");
    int trg=in.nextInt();
    int idx=-1;
    for(int i=0;i<n;i++){
    if(arr[i]==trg){
         idx=i;
       break;
    }
    }
  if(idx!=-1){
    System.out.println(idx);
  }else{
    System.out.println(-1);
  }
    
}
}

