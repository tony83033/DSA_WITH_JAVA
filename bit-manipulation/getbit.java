import java.util.*;
public class getbit{
    public static int find(int n , int ith){
        int bitMask =  1<<ith;

        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any binnary number");
        int num = sc.nextInt();

        System.out.print("Enter ith bit number");
        int ith = sc.nextInt();

        System.out.print(find(num,ith));
    }
}