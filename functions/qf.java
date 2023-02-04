import java.util.*;
public class qf{
    public static int aveg(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");
        a = sc.nextInt();
        System.out.print("Enter another number");
        b = sc.nextInt();
        System.out.print("Enter third number");
        c = sc.nextInt();

        System.out.print("Average of three number is "+aveg(a,b,c));


    }
}