import java.util.*;
public class short2{
    public static float findDisa(String disa){
        int x =0;
        int y =0;

        for(int i=0; i<disa.length();i++){
            if(disa.charAt(i)=='n'){
                y++;
            }else if(disa.charAt(i)=='s'){
                y--;
            }else if(disa.charAt(i)=='e'){
                x++;
            }else if(disa.charAt(i)=='w'){
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any thing  = ");
        String disa = sc.next();
         System.out.print(findDisa(disa));
    }
}