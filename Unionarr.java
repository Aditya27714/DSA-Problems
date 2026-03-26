import java.util.*;
public class Unionarr {
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
               System.out.println("Enter the size of arr 1");
               int n1 = sc.nextInt();
               System.out.println("Enter the elment of arr1 ");
               int []arr1= new int[n1];
               for(int i=0;i<n1;i++){
                arr1[i]=sc.nextInt();
               }
               System.out.println("Enter the size of arr2 ");
               int n2 = sc.nextInt();
               System.out.println("Enter the elenmt of arr2 ");
               int []arr2 = new int[n2];
               for(int j=0;j<n2;j++){
                arr2[j]=sc.nextInt();
               }
              int t1=0 ;int t2 =0;
            List<Integer> union =new ArrayList<>();
           
             while(t1<arr1.length &&t2<arr2.length){
                if(arr1[t1]<arr2[t2]){
                    union.add(arr1[t1]);
                    t1++;
                }
                else if(arr1[t1]> arr2[t2]){
                    union.add(arr2[t2]);
                    t2++;
                }
                else if(arr1[t1]==arr2[t2]){
                    union.add(arr1[t1]);
                    t1++;
                    t2++;
                
                    
                }
             } 
        while (t1 < n1) {
            union.add(arr1[t1++]);
        }
        while (t2 < n2) {
            union.add(arr2[t2++]);
        }
        System.out.println("Union array is "+ union);

             }
          
         
            }    

