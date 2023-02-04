import java.util.*;
public class oddeven {
    public static void find(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.print("Even number");

        }else if((n & bitMask)==1){
            System.out.print("Odd number");

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number = ");
        int num = sc.nextInt();

        find(num);

    }
}