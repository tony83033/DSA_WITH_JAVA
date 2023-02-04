import java.util.*;
public class count{
    public static void check(String str){
        StringBuilder nstr = new StringBuilder();
        for(int i =0;i<str.length();i++){
            Integer count = 0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                
                count++;
                i++;

            }
            nstr.append(str.charAt(i));
            if(count>1){
                nstr.append(count.toString());
            }
        }
        System.out.print(nstr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any thing  = ");
        String str = sc.next();
        check(str);
    }
}