import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if(n<=5){
            System.out.println("n is less then 5");
        }
        if((n%2==0 && n<=5)){
            System.out.print("not weird");
        }else if((n%2==0 && n>=6 && n<20)){
            System.out.print("weird");
        }else if(n>20 && n%2==0){
            System.out.print("not weird");
        }else{
            System.out.print("weird");
        }
    }
}