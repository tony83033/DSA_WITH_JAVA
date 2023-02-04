import java.util.*;
public class binary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int bnum = 0;
        System.out.print("Enter any binary number");
        bnum = sc.nextInt();
        int dec=0,ld=0,pow=0;

        while(bnum>0){
            ld = bnum%10;
            dec = dec +(ld*(int)Math.pow(2,pow));
            bnum = bnum/10;
            pow++;
        }
        System.out.print("Decimal number is "+dec);
    }
}