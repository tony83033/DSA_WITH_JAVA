import java.util.*;
public class palindrome{
    public static boolean isPali(int num){
        int r=0,sum=0,temp=0;
        temp=num;
        while(num>0){
            r=num%10;
            sum = (sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter any number");
        num = sc.nextInt();

        System.out.print(isPali(num));
    }
}