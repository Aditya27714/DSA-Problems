import java.util.*;
public class Palindrome{


  public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        int temp = num;
         int reversed = 0;

         while(num !=0){
             int digit  = num % 10;
             reversed =  reversed * 10 + digit ;
             num = num /10;

         }
         if (temp==reversed){
             System.out.println("The number is Palindrome ");
         }
         else {
             System.out.println("Not Palindomre number");
         }


    } {
    
}
}
