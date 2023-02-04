import java.util.*;
public class dectobin{
    public static int changeToBin(int decNum){
        int pow=0,rem =0;
        int bNum=0;
        while(decNum>0){
            rem = decNum%2;
            bNum = bNum+(rem*(int)Math.pow(10,pow));
            decNum = decNum/2;
            pow++;
        }
        return bNum;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number");
    int decNum = sc.nextInt();
    System.out.print("Binary number is "+changeToBin(decNum));
}
}
    