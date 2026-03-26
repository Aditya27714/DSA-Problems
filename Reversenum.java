import java.util.Scanner;

public class Reversenum {
    
    public static void main(String[] args) {
        System.out.println("enter the number . ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();

        int reversed = 0;
        while(num!=0){
            int digit = num % 10;
            reversed = reversed * 10 + digit ;
            num = num / 10;

        }
        System.out.println("The reverse no is " + reversed);
    }
    
}
