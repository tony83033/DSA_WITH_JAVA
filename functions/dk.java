import java.util.*;
public class dk{
    public static void leapyear(int year){
        boolean a=(year%4==0);
        boolean b=(year%100!=0);
        boolean c =(year%400==0);

        if(a && (b||c)){
            System.out.print("Year is leap yeear "+year);
            
        }else{
            System.out.print("Year is not leap year"+year);
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Year");
        int year = sc.nextInt();
        leapyear(year);
    }
}
