import java.util.*;
public class secondbinary{
    public static int binToDec(int bnum){
        int pow=0; int decnum=0;
        int ld=0;
        while(bnum>0){
            ld = bnum%10;
            decnum = decnum +(ld*(int)Math.pow(2,pow));
            pow++;
            bnum = bnum/10;
        }
        return decnum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");
        int bnum = sc.nextInt();
        System.out.print(binToDec(bnum));
    }
}