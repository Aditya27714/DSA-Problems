import java.util.Scanner;
public class countofallnumber {
    public static void main(String[] args) {
        System.out.println("Enter the no . ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
      int counter = 0;
        if (num == 0) {

            System.out.println("1");

        } else{
            while(num!=0){
                num=num/10;
                 counter ++;

            }
            System.out.println("the nos. is"+   counter);
        }
    }

    
}
