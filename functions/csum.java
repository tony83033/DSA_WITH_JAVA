import java.util.*;
public class csum{
    public static int calsum(int num){
        int r=0,sum=0;
        while(num>0){
            r = num%10;
            sum+=r;
            num = num/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");
        int num = sc.nextInt();
        System.out.print("Sum of the digits is "+calsum(num));
    }
}