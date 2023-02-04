import java.util.*;
public class iseven{
    public static boolean checkEven(int num){
            if(num%2==0){
                return true;
            }else{
                return false;
            }
        }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int num =0;
        System.out.print("Enter any number ");
        num = sc.nextInt();

        System.out.print(checkEven(num));
    }
}